package hw17_class20;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need bachelors diploma");
    }
}