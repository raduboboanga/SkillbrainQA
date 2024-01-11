package SalariiAngajati;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String employmentDate;
    protected  int reference;

    abstract double calculateSalary();

    abstract String getName();

    Employee(String firstName, String lastName, int age, String employmentDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
    }

}
