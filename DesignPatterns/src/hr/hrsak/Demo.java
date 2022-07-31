package hr.hrsak;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    static void saveToFile(BasicSingleton singleton, String filename) throws Exception
    {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception{
        try(FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis)){
            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        saveToFile(singleton, "Singleton.bin");
        final BasicSingleton singleton1 = readFromFile("Singleton.bin");

        System.out.println(singleton == singleton1);


        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());


    }

}
