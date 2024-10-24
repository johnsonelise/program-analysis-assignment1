package homework3;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.ClassInfo;


import java.util.logging.Logger;

public class EliseListener extends ListenerAdapter {
    private static final Logger logger = Logger.getLogger(EliseListener.class.getName());

    @Override
    public void classLoaded(VM vm, ClassInfo loadedClass) {
        System.out.println("EliseLoaded");
    }
}
