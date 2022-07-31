package hr.hrsak;


import java.util.HashMap;

public class Printer {

    private static HashMap<Subsystem, Printer> instances= new HashMap<>();
    private static int instanceCount = 0;
    private Printer(){
        instanceCount++;
        System.out.println(" Instances created so far: " + instanceCount);
    }

    public static Printer get(Subsystem ss)
    {
        if (instances.containsKey(ss))
            return instances.get(ss);

        Printer instance = new Printer();
        instances.put(ss, instance);
        return instance;
    }
}
