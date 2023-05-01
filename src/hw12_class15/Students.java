package hw12_class15;

public class Students {

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.name = "Siarhei";
        student1.id = "sid001";
        student1.numberOfStudents++;

        student2.name = "Yeska";
        student2.id = "sid002";
        student2.numberOfStudents++;

        student3.name = "John";
        student3.id = "sid003";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }
}
