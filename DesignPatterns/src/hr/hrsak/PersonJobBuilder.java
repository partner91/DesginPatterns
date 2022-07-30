package hr.hrsak;

public class PersonJobBuilder extends PersonBuilder{

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName)
    {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder  as(String position){
        person.position = position;
        return  this;
    }
}
