package hw15_class18;

public class Teacher {
    private String name;
    private String subject;
    private int age;
    private double salary;

    public Teacher(String name, String subject, int age, double salary) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.salary = salary;
    }

    public void letMeIntroduce() {
        System.out.println("Hello students. My name is " + name + ". I'm  " + age + " years old and i'm a " + subject + " teacher.");
    }

    public void lesson() {
        if (salary > 50000.0) {
            System.out.println("Let's start the lesson.");
        } else {
            System.out.println("The teacher is absent.");
        }
    }

    public void classTopic() {
        if (subject.equalsIgnoreCase("math")) {
            System.out.println("Today's class topic is Linear algebra.");
        } else if (subject.equalsIgnoreCase("chemistry")) {
            System.out.println("Today's class topic is Organic chemistry.");
        } else if (subject.equalsIgnoreCase("piano")) {
            System.out.println("Today's class topic is Rhythm.");
        } else {
            System.out.println("I will teach you how to kill :D");
        }
    }

    public void printInfo() {
        System.out.println("Teachers name: " + name + ".");
        System.out.println("Subject: " + subject + ".");
        System.out.println("Age: " + age + ".");
        System.out.println("Salary: " + salary + ".");
    }
}

class MathTeacher extends Teacher {

    public MathTeacher(String name, String subject, int age, double salary) {
        super(name, subject, age, salary);
    }
}

class ChemistryTeacher extends Teacher {

    public ChemistryTeacher(String name, String subject, int age, double salary) {
        super(name, subject, age, salary);
    }
}

class PianoTeacher extends Teacher {

    public PianoTeacher(String name, String subject, int age, double salary) {
        super(name, subject, age, salary);
    }
}
