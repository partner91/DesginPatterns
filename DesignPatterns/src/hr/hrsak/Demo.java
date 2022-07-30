package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                .in("Zagreb")
                .at("Cajkovceva")
                .withPostCode("10000")
                .works()
                .as("Developer")
                .at("MSG")
                .build();
        System.out.println(person);



    }
}

