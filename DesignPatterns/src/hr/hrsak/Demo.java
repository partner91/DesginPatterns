package hr.hrsak;

public class Demo {
    public static void main(String[] args) {


        Employee john = new Employee("John", new Address("123 London Road", "London", "Uk"));

        Employee chris = new Employee(john);

        chris.name = "Chris";
        System.out.println(john);
        System.out.println(chris);
    }
}
