package hw14_class17;

public class Students {
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        System.out.println("Student " + name + " has an average grade " + avgGrade());
    }

    private int avgGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static void main(String[] args) {

        Students student1 = new Students("John", 99, 95, 90);
        Students student2 = new Students("Asghar", 98, 99, 99);
        Students student3 = new Students("Siarhei", 80, 75, 91);
        Students student4 = new Students("Yeska", 99, 97, 98);
        Students student5 = new Students("Jason", 79, 76, 60);
    }
}
