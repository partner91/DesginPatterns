package hr.hrsak;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{

    public EmployeeBuilder worksAt(String name){
        person.position = name;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
