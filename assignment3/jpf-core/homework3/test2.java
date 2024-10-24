package homework3; 

import homework3.AElise;
import homework3.BElise;
import homework3.CElise;


public class test2 {
    public static void main(String[] args) {

        System.out.println("Hello, World! test2");
        // System.out.println("And I'm running my main test file!");

        // AElise
        AElise.max(1, 2);
        
        System.out.println("test2!");

    }
}


// ok so to edit and run:
// RUN 'java -jar $JPF_HOME/build/RunJPF.jar HelloWorld_elise.jpf' in projects/jpf/jpf-core
// BUILD 'javac HelloWorld_elise.java' in /media/elise/OS/Users/johns/OneDrive/Documents/school/program-analytics/homework3
// EDIT BUILD 'nano HelloWorld_elise.jpf' in project/jpf/jpf-core





// NEW STUFF HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// edit listener edit ChoiceTracker in ~/projects/jpf/jpf-core/src/main/gov/nasa/jpf/listener
// RUN IN ~/projects/jpf/jpf-core USING java -cp $JPF_HOME/build/jpf.jar gov.nasa.jpf.tool.RunJPF HelloWorld_elise.jpf
// CALL ./gradlew IF YOU EDIT ChoiceTracker!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!