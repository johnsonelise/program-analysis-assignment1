/*
* Copyright (C) 2014, United States Government, as represented by the
* Administrator of the National Aeronautics and Space Administration.
* All rights reserved.
*
* The Java Pathfinder core (jpf-core) platform is licensed under the
* Apache License, Version 2.0 (the "License"); you may not use this file except
* in compliance with the License. You may obtain a copy of the License at
* 
*        http://www.apache.org/licenses/LICENSE-2.0. 
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and 
* limitations under the License.
*/

package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.report.ConsolePublisher;
import gov.nasa.jpf.report.Publisher;
import gov.nasa.jpf.report.PublisherExtension;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.SystemState;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;


/**
* generic choice tracker tool, to produce a list of choice values that
* can be used to create readable replay scripts etc.
*/
public class ChoiceTracker extends ListenerAdapter {

  private PrintWriter my_writer;
  private HashMap<String, String> memorized;
  private HashSet<String> lines;
  private ArrayList<Object> curr_parameters;
  private int curr_args = 0;
  private Stack<Integer> stack;

  public ChoiceTracker (Config config, JPF jpf) {
    memorized = new HashMap<>();
    lines   = new HashSet<>();
    curr_parameters = new ArrayList<>();
    stack = new Stack<>();

    System.out.println("Running Elise's listener");

    try {
      // Initialize PrintWriter to write to report.txt
      my_writer = new PrintWriter("./results/report.txt");
      // System.out.println("made it!");
    } catch (FileNotFoundException e) {
      // my_writer.println("no make it :(");
      e.printStackTrace();
    }

    my_writer.println("           ----- STARTING OUTPUT -----           ");
    my_writer.println("------------- STARTING MEMORIZATION --------=----");
    // System.out.println("------------ STARTING MEMORIZATION ------------");

    // System.out.println(memorized.toString());
 
  }

  @Override
  public void methodEntered(VM vm, ThreadInfo currentThread, MethodInfo enteredMethod) {
      // Get method signature and name
      String methodName = enteredMethod.getFullName();
      // System.out.println("Entered method: " + methodName);
      if(!methodName.contains("Elise")){
        return;
      }
      
      // Get the current frame to retrieve the method parameters
      StackFrame frame = currentThread.getTopFrame();
      
      if (frame != null && enteredMethod != null) {
          int numArgs = enteredMethod.getNumberOfArguments();  // Get number of arguments
          curr_args = numArgs;
          
          for (int i = 0; i < numArgs; i++) {
              Object argValue = frame.getArgumentValues(currentThread)[i];
              // System.out.println("class: " + argValue.getClass().toString() + "\t\t\tvalue: " + argValue);
              if(!argValue.getClass().toString().contains("Dynamic")){
                curr_parameters.add(argValue);
                // my_writer.println("curr param in num arg loop: " + curr_parameters.toString());
              }
          }
          stack.push(numArgs);
          // my_writer.println("num args: " + numArgs);
          // System.out.println();
          String memorize_string = methodName.split("\\(")[0] + "(";
          // System.out.print("Memoizing " + methodName.split("\\(")[0] + "(" );
          for(int i = 0; i < curr_parameters.size()-1; i++){
            // System.out.print(curr_parameters.get(i) + ", ");
            memorize_string = memorize_string + (curr_parameters.get(i) + ", ");
          }

          if(curr_parameters.size() != 0){
            memorize_string = memorize_string + (curr_parameters.get(curr_parameters.size()-1) +  ")");
            // System.out.print(curr_parameters.get(curr_parameters.size()-1));
            // System.out.println( "):" + ".");
          }

          if(memorized.containsKey(memorize_string)){
            // System.out.println("Returning memoized return value for " + memorize_string + ":" + memorized.get(memorize_string) + ".");
            my_writer.println( "Returning memoized return value for " + memorize_string + ":" + memorized.get(memorize_string) + ".");
            currentThread.skipInstruction();
            return;
          // }else if(methodName.contains("obj_input")){
            // System.out.println(memorized.toString());
            // System.out.println(memorize_string);
            // System.out.println("ERROR");
          }
      }
  }

  @Override
  public void methodExited(VM vm, ThreadInfo currentThread, MethodInfo exitedMethod) {
      // Get method signature and name
      String methodName = exitedMethod.getFullName();
      
      if(!methodName.contains("Elise")){
        return;
      }

      int temp = stack.pop();

      StackFrame frame = currentThread.getTopFrame();
      
      if (frame != null && exitedMethod.getReturnType() != "void" && exitedMethod.getReturnType() != "V" && (exitedMethod.isStatic() == true)) {
      // if (frame != null && exitedMethod.getReturnType() != "void" && exitedMethod.getReturnType() != "V") {
        String returnType = exitedMethod.getReturnType();
        Object returnValue = null;

        if (returnType.equals("I")) {
          try {
            returnValue = frame.peek();  // Gets the top value from the operand stack for int
          } catch (Exception e) {
            
          }

        } else if (returnType.equals("Z")) {
          
          returnValue = (frame.peek() != 0);  // Non-zero value represents true in JVM

        } else if (returnType.equals("D")) {

          returnValue = frame.peekDouble();  // For double return type

        } else if (returnType.equals("J")) {

          returnValue = frame.peekLong();  // For long return type

        } else {
          
          my_writer.print( methodName.split("\\(")[0] + "(" );

          for(int i = 0; i < temp-1; i++){
            // System.out.print(curr_parameters.get(i) + ", ");
            my_writer.print( curr_parameters.get(i) + ", ");
          }

          if(temp != 0){
            // System.out.print(curr_parameters.get(curr_parameters.size()-1));
            my_writer.print( curr_parameters.get(temp-1));
          }

          // System.out.println("):returnValue is not memoizable.");
          my_writer.println( "):returnValue is not memoizable.");
          
          curr_parameters.clear();

          return;
        }
        
        String memorize_string = methodName.split("\\(")[0] + "(";
        // System.out.print("Memoizing " + methodName.split("\\(")[0] + "(" );
        // my_writer.println("temp: " + temp);
        for(int i = 0; i < curr_parameters.size()-1; i++){
          // System.out.print(curr_parameters.get(i) + ", ");
          memorize_string = memorize_string + (curr_parameters.get(i) + ", ");
        }
        // System.out.println( "):" + returnValue + ".");
        if(temp != 0){
          // System.out.println(curr_parameters.get(curr_parameters.size()-1));
          memorize_string = memorize_string + (curr_parameters.get(curr_parameters.size()-1));
        }
        memorize_string = memorize_string + ")";

        if(!memorized.containsKey(memorize_string)){

          memorized.put(memorize_string, returnValue.toString());
          my_writer.println("Memorizing " + memorize_string + ":" + returnValue + ".");

        }
        curr_parameters.clear();
      }

  }

  @Override
  public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction, Instruction executedInstruction) {
      // Get the class and method information from the executed instruction
      String className = executedInstruction.getMethodInfo().getClassInfo().getName();
      String methodName = executedInstruction.getMethodInfo().getFullName();
      int lineNumber = executedInstruction.getLineNumber();

      if(methodName.contains("Elise")){
        lines.add(methodName + ": " + lineNumber);
        // System.out.println("line: " + methodName + ": " + lineNumber);
      }

      // Print the class, method, and line number
      // System.out.println("Executed instruction in class: " + className + ", method: " + methodName + ", line: " + lineNumber);
  }

  @Override
  public void searchFinished(Search search) {
    // System.out.println("------------  ENDING MEMORIZATION ------------");
    my_writer.println("-------------  ENDING MEMORIZATION -------------");

    my_writer.println("");
    my_writer.println("");

    // System.out.println("------------ STARTING CODE COVERAGE ------------");
    my_writer.println("------------ STARTING CODE COVERAGE ------------");

    
    Object[] lines_array = lines.toArray();
    Arrays.sort(lines_array);
    
    for (int i = 0; i < lines_array.length; i++) {
      // System.out.println(lines_array[i]);
      my_writer.println(lines_array[i]);
    }

    // System.out.println("------------  ENDING CODE COVERAGE ------------");
    my_writer.println("------------  ENDING CODE COVERAGE ------------");

    my_writer.flush();  
    my_writer.close(); // Close the writer when search is finished

  }

}

