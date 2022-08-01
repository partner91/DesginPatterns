package hr.hrsak;

public class Person implements Human{
    public Person() {
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }

    @Override
    public void talk() {
        System.out.println("I'm talking");
    }
}
