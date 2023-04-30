package hw11_class14;

public class Student {

    char grade(int score) {

        char studentGrade = ' ';

        if (score > 90) {
            studentGrade = 'A';
        } else if (score > 80) {
            studentGrade = 'B';
        } else if (score > 70) {
            studentGrade = 'C';
        } else if (score > 50) {
            studentGrade = 'D';
        } else {
            studentGrade = 'F';
        }
        return studentGrade;
    }

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.grade(99));
    }
}
