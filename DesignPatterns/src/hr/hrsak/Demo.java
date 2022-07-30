package hr.hrsak;

//SRP
public class Demo {
    public static void main(String[] args) throws Exception {

        Journal j = new Journal();

        j.addEntry("I cried today");
        j.addEntry("I ate the bug");

        j.save("Test.txt");
        Persistence p = new Persistence();

        String filename = "Test.txt";

        p.saveToFile(j,filename,true);



        System.out.println(j);
    }
}
