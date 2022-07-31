package hr.hrsak;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    static {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e)
        {
            System.err.println("failed to create singleton");
        }
    }

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
