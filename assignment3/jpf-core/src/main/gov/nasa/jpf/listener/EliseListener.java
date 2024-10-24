package homework3;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.vm.VM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EliseListener extends ListenerAdapter {
    
    // HashMap to store covered lines for each class
    private Map<String, Set<Integer>> coverageMap = new TreeMap<>();

    @Override
    public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
        // Get method info and class name
        MethodInfo mi = executedInsn.getMethodInfo();
        if (mi != null) {
            String className = mi.getClassName();
            int lineNumber = executedInsn.getLineNumber();

            // Ignore synthetic methods or negative line numbers
            if (lineNumber >= 0) {
                coverageMap.putIfAbsent(className, new TreeSet<>());
                coverageMap.get(className).add(lineNumber);  // Track unique lines for the class
            }
        }
    }

    // @Override
    // public void searchFinished(VM vm) {
    //     // Write the coverage report to a file
    //     try (FileWriter writer = new FileWriter("report.txt")) {
    //         for (Map.Entry<String, Set<Integer>> entry : coverageMap.entrySet()) {
    //             String className = entry.getKey();
    //             for (Integer line : entry.getValue()) {
    //                 writer.write(className + ":" + line + "\n");
    //             }
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }
}
