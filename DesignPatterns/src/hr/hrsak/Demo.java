package hr.hrsak;

public class Demo {
    public static void main(String[] args) {
        Person john = new Person("John");
        Person chris = new Person("Chris");
        Person mat = new Person("Mat");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(john, chris);
        relationships.addParentAndChild(john, mat);
        new Research(relationships);
    }
}
