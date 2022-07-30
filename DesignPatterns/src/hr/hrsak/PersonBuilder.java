package hr.hrsak;

public class PersonBuilder<SELF extends PersonBuilder<SELF>>{
    protected Person person = new Person();

    public SELF withName(String name){
        person.name = name;
        return self();
    }


    protected SELF self(){
        return (SELF) this;
    }

    @Override
    public String toString() {
        return person.toString();
    }
}
