package hw20_class26;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String personInfo() {
        return "Name : " + name + ", last name : " + lastName + ", age : " + age + ", salary : " + salary + ".";
    }
}