package homework4;

import java.awt.Label;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class cfgtool {

    static PrintWriter writer;
    static ArrayList<basic_blocks> blocks;
    static basic_blocks block;
    static MethodNode main;
    static ArrayList<org.objectweb.asm.Label> labels;
    static ArrayList<org.objectweb.asm.Label> separate;
        public static void main(String[] args) {
            
            blocks      = new ArrayList<>();
            labels      = new ArrayList<>();
            separate = new ArrayList<>();
    
            if(args.length < 1){ // edge case check 
                System.out.println("ERROR: no input given");
                return;
            }
            
            try {  // make output file!!
                writer = new PrintWriter("output.txt");
            } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
                return;
            }

            // start reading in the main here!
            writer.println("-------- STARTING CFG OUTPUT --------");
            try{

                ClassReader classReader = new ClassReader(args[0].substring(0, args[0].length()-5));

                ClassNode classNode = new ClassNode();
                classReader.accept(classNode, 0);
                
                for (MethodNode method : classNode.methods) {
                    if (method.name.equals("main") && method.desc.equals("([Ljava/lang/String;)V")) {
                        main = method;
                        break;
                    }
                }

                if(main == null){
                    System.err.println("Error: Main not found");
                }

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

            // print_byte(main);

            // System.out.println("\n\n\n\n --- starting my stuff ---");

            // start making blocks nad connecting them

            int blocki = 0;
            block = new basic_blocks(0);
            HashMap<org.objectweb.asm.Label, ArrayList<Integer>> mappings = new HashMap<>(); // label to jump block
            HashMap<Integer, ArrayList<org.objectweb.asm.Label>> labelmap = new HashMap<>(); // block to its label names


            for(int i =0 ; i < main.instructions.size(); i++){

                if(main.instructions.get(i).getOpcode() == Opcodes.GOTO){
                    JumpInsnNode node = (JumpInsnNode) main.instructions.get(i);
                    separate.add(node.label.getLabel());
                }

            }

            for(int i = 0; i < main.instructions.size(); i++){
                if(main.instructions.get(i).getType() == AbstractInsnNode.JUMP_INSN){
                    JumpInsnNode node = (JumpInsnNode) main.instructions.get(i);

                    blocks.add(block);
                    // block = new basic_blocks(++blocki);
                    block.instructs.add(main.instructions.get(i));

                    labels.add(node.label.getLabel());
                    
                    if(!mappings.containsKey(node.label.getLabel())){
                        mappings.put(node.label.getLabel(), new ArrayList<>());
                        mappings.get(node.label.getLabel()).add(blocki);
                    }else{
                        ArrayList array_blocks = mappings.get(node.label.getLabel());
                        array_blocks.add(blocki);
                        mappings.put(node.label.getLabel(), array_blocks);
                    }

                    // System.out.println("jump!! id: " + blocki + " label: " + node.label.getLabel());
                    if(main.instructions.get(i).getOpcode() == Opcodes.GOTO){
                        block.loop_flag = true;
                    }

                    block = new basic_blocks(++blocki);

                }else if(main.instructions.get(i).getType() == AbstractInsnNode.LOOKUPSWITCH_INSN){
                    LookupSwitchInsnNode node = (LookupSwitchInsnNode) main.instructions.get(i);
                    
                    blocks.add(block);
                    // block = new basic_blocks(++blocki);
                    block.instructs.add(main.instructions.get(i));


                    for(LabelNode lab : node.labels){
                        labels.add(lab.getLabel());
                        if(!mappings.containsKey(lab.getLabel())){
                            mappings.put(lab.getLabel(), new ArrayList<>());
                            mappings.get(lab.getLabel()).add(blocki);
                        }else{
                            ArrayList array_blocks = new ArrayList<>();
                            array_blocks.add(blocki);
                            mappings.put(lab.getLabel(), array_blocks);                        }
                    }

                    // System.out.println("lookup!!");              
                    
                    block = new basic_blocks(++blocki);

                }else if(main.instructions.get(i).getType() == AbstractInsnNode.TABLESWITCH_INSN){
                    TableSwitchInsnNode node = (TableSwitchInsnNode) main.instructions.get(i);

                    blocks.add(block);
                    // block = new basic_blocks(++blocki);
                    block.instructs.add(main.instructions.get(i));


                    for(LabelNode lab : node.labels){
                        labels.add(lab.getLabel());
                        if(!mappings.containsKey(lab.getLabel())){
                            mappings.put(lab.getLabel(), new ArrayList<>());
                            mappings.get(lab.getLabel()).add(blocki);
                        }else{
                            ArrayList array_blocks = new ArrayList<>();
                            array_blocks.add(blocki);
                            mappings.put(lab.getLabel(), array_blocks);
                        }
                    }
                    // System.out.println("table!!");

                    block = new basic_blocks(++blocki);

                }else{


                    if(main.instructions.get(i).getType() == AbstractInsnNode.LABEL){
                        LabelNode label = (LabelNode) main.instructions.get(i);

                        if(labels != null && labels.contains(label.getLabel())){
                            
                            if(!labelmap.containsKey(blocki)){
                                labelmap.put(blocki, new ArrayList<>());
                                labelmap.get(blocki).add(label.getLabel());
                            }else{
                                ArrayList array_labels = new ArrayList<>();
                                array_labels.add(label.getLabel());
                                labelmap.put(blocki, array_labels);
                            }

                            blocks.add(block);
                            // block = new basic_blocks(++blocki);
                            block.instructs.add(main.instructions.get(i));

                            // System.out.println("jump landing! w/ id: " + blocki + " label: " + label.getLabel());

                            block = new basic_blocks(++blocki);

                        }else{
                            
                            if(separate.contains(label.getLabel())){

                                blocks.add(block);
                                block = new basic_blocks(++blocki);
                                block.instructs.add(main.instructions.get(i));

                                if(!labelmap.containsKey(blocki)){
                                    labelmap.put(blocki, new ArrayList<>());
                                    labelmap.get(blocki).add(label.getLabel());
                                }else{
                                    ArrayList array_labels = new ArrayList<>();
                                    array_labels.add(label.getLabel());
                                    labelmap.put(blocki, array_labels);
                                }

                                // System.out.println("other label w/ current i: " + blocki + " label: " + label.getLabel());
                                // block = new basic_blocks(++blocki);

                            }else{
                                block.instructs.add(main.instructions.get(i));
                                // System.out.println("other label w/ current i: " + blocki + " label: " + label.getLabel());
                            }
                        }
                    }else{
                        block.instructs.add(main.instructions.get(i));
                        // System.out.println("other instruction");
                    }
                }
            }

            // blocks.add(block);

            for (Map.Entry<Integer, ArrayList<org.objectweb.asm.Label>> jump_from_block : labelmap.entrySet()) {
                for(Map.Entry<org.objectweb.asm.Label, ArrayList<Integer>> jump_to_block : mappings.entrySet()){
                    // goes through both, now need to loop through labels to see if they match
                    for(int i = 0; i < jump_from_block.getValue().size(); i++){
                        // check labels match -- if they do draw connections
                        if(jump_from_block.getValue().get(i) == jump_to_block.getKey()){
                            for(Integer to_block_id : jump_to_block.getValue()){
                                blocks.get((int) to_block_id).post_connections.add(blocks.get(jump_from_block.getKey()));
                                blocks.get(jump_from_block.getKey()).pre_connections.add(blocks.get((int) to_block_id));
                                // System.out.println("connection: " + jump_from_block.getKey() + " => " + to_block_id);
                            }
                        }
                    }
                }
            }

            for(int i = 0; i < (blocks.size() - 1); i++){
                if(!blocks.get(i).loop_flag){
                    blocks.get(i).post_connections.add(blocks.get(i+1));
                    blocks.get(i+1).pre_connections.add(blocks.get(i));
                }
            }

            for(basic_blocks x: blocks){
                writer.print(x.toString());
            }

            calc_dom();

            // writer.println("done!!!");

            writer.close();

    }

    public static void calc_dom(){
        ArrayList<ArrayList<Integer>> dom_sets = new ArrayList<>();

        ArrayList<Integer> full_set = new ArrayList<>();
        full_set.add(0);
        dom_sets.add(full_set);
        full_set = new ArrayList<>();


        for(int i = 0; i < blocks.size(); i++){
            full_set.add(i);
        }

        // full set has everything
        for(int i = 1; i < blocks.size(); i++){
            dom_sets.add(full_set);
        }

        // loop until no change
        boolean change = true;
        while (change) {
            change = false;

            // start checking here elise!!!!!!!!!!!!!!!
            // todo 

            for(int i = 1; i < blocks.size(); i++){

                ArrayList<Integer> update = new ArrayList<>();
                update.add(i);

                ArrayList<Integer> current = new ArrayList<>();
                
                if(blocks.get(i).pre_connections.size() == 1){
                    current = dom_sets.get(blocks.get(i).pre_connections.get(0).id);
                }

                for(int j = 0; j < (blocks.get(i).pre_connections.size() - 1); j++){
                    // calc intersections

                    for(int k = 0; k < dom_sets.get(blocks.get(i).pre_connections.get(j).id).size(); k++){
                        if(j == 0 && dom_sets.get(blocks.get(i).pre_connections.get(j+1).id).contains(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k))){
                            current.add(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k));
                        }else if(dom_sets.get(blocks.get(i).pre_connections.get(j+1).id).contains(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k)) && current.contains(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k))){
                            current.add(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k));
                        }else if(current.contains(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k))){
                            current.remove(dom_sets.get(blocks.get(i).pre_connections.get(j).id).get(k));
                        }
                    }
                }

                update.addAll(current);

                // should be sorted but as a double check!
                Collections.sort(update);

                // union intersections and current
                for(int j = 0; j < dom_sets.get(i).size(); j++){
                    if((dom_sets.get(i).get(j) != update.get(j)) || (dom_sets.get(i).size() != update.size())){
                        dom_sets.set(i, update);
                        change = true;
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < dom_sets.size(); i++){
            writer.print("DOM Set for Block " + i + ": ");
            for(int j = 0; j < (dom_sets.get(i).size() - 1); j++){
                writer.print(dom_sets.get(i).get(j) + ", ");
            }
            writer.println(dom_sets.get(i).get(dom_sets.get(i).size() - 1));
        }
    }

    public static class basic_blocks {

        int id = -1;
        boolean loop_flag = false;
        ArrayList<basic_blocks> post_connections;
        ArrayList<basic_blocks> pre_connections;
        ArrayList<basic_blocks> doms;
        ArrayList<AbstractInsnNode> instructs;

        basic_blocks(){
            post_connections = new ArrayList<>();
            pre_connections = new ArrayList<>();
            instructs = new ArrayList<>();
            doms = new ArrayList<>();
        }

        basic_blocks(int id){
            this.id = id;
            post_connections = new ArrayList<>();
            pre_connections = new ArrayList<>();
            instructs = new ArrayList<>();
            doms = new ArrayList<>();
        }

        @Override
        public String toString() {

            ArrayList<Integer> ids = new ArrayList<>();

            for(int i = 0; i < post_connections.size(); i++){
                ids.add(post_connections.get(i).id);
            }

            if(ids.size() == 0){
                return "ID: " + id + " => null\n";
            }
            Collections.sort(ids);

            String returner = "ID: " + id + " => ";
            // String returner = "";
            for(int x: ids){
                returner += x + ", ";
            }
            return returner.substring(0, returner.length() - 2) + "\n";
        }        
    }

    private static void print_byte(MethodNode methodNode) {
        for (AbstractInsnNode insn : methodNode.instructions) {
            int opcode = insn.getOpcode();
            if (opcode == -1) {  // Opcode -1 means it's a LabelNode or other non-instruction node.
                if (insn instanceof LabelNode) {
                    System.out.println("Label: " + ((LabelNode) insn).getLabel());
                }
                continue;
            }
            // Print the type of instruction based on the opcode.
            String instructionName = getOpcodeName(opcode);
            if ((insn instanceof VarInsnNode) ) {
                VarInsnNode varInsn = (VarInsnNode) insn;
                System.out.println("Variable Instruction: " + instructionName +
                        " - Variable Index: " + varInsn.var);
            } else if (insn instanceof JumpInsnNode ) {
                JumpInsnNode jumpInsn = (JumpInsnNode) insn;
                System.out.println("Jump Instruction: " + instructionName +
                        " - Target Label: " + jumpInsn.label.getLabel());
            } else if (insn instanceof LabelNode ) {
                LabelNode labelNode = (LabelNode) insn;
                System.out.println("Label: " + labelNode.getLabel());
            } else if (insn instanceof InsnNode ) {
                InsnNode insnNode = (InsnNode) insn;
                System.out.println("Instruction: " + instructionName);
            } else if (insn instanceof IntInsnNode ) {
                IntInsnNode intInsn = (IntInsnNode) insn;
                System.out.println("Int Instruction: " + instructionName +
                        " - Operand: " + intInsn.operand);
            } else if (insn instanceof TypeInsnNode ) {
                TypeInsnNode typeInsn = (TypeInsnNode) insn;
                System.out.println("Type Instruction: " + instructionName +
                        " - Type: " + typeInsn.desc);
            } else if (insn instanceof LdcInsnNode ) {
                LdcInsnNode ldcInsn = (LdcInsnNode) insn;
                System.out.println("LDC Instruction: " + ldcInsn.cst);
            } else if (insn instanceof FieldInsnNode ) {
                FieldInsnNode fieldInsn = (FieldInsnNode) insn;
                System.out.println("Field Instruction: " + instructionName +
                        " - Owner: " + fieldInsn.owner + ", Name: " + fieldInsn.name + ", Desc: " + fieldInsn.desc);
            } else if (insn instanceof MethodInsnNode ) {
                MethodInsnNode methodInsn = (MethodInsnNode) insn;
                System.out.println("Method Instruction: " + instructionName +
                        " - Owner: " + methodInsn.owner + ", Name: " + methodInsn.name + ", Desc: " + methodInsn.desc);
            } else {
                System.out.println("Other Instruction: Opcode " + insn.getOpcode());
            }
        }
    }

    private static String getOpcodeName(int opcode) {
        // Returns a readable name for each opcode.
        switch (opcode) {
            case Opcodes.NOP: return "NOP";
            case Opcodes.ACONST_NULL: return "ACONST_NULL";
            case Opcodes.ICONST_M1: return "ICONST_M1";
            case Opcodes.ICONST_0: return "ICONST_0";
            case Opcodes.ICONST_1: return "ICONST_1";
            case Opcodes.ICONST_2: return "ICONST_2";
            case Opcodes.ICONST_3: return "ICONST_3";
            case Opcodes.ICONST_4: return "ICONST_4";
            case Opcodes.ICONST_5: return "ICONST_5";
            case Opcodes.ISTORE: return "ISTORE";
            case Opcodes.ILOAD: return "ILOAD";
            case Opcodes.IFNULL: return "IFNULL";
            case Opcodes.IFNONNULL: return "IFNONNULL";
            case Opcodes.GOTO: return "GOTO";
            case Opcodes.RETURN: return "RETURN";
            default: return "Unknown Opcode " + opcode;
        }
    }
}