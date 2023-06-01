package hw19_class25;

import java.util.HashSet;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("John", "abc00001"));
        students.add(new Student("Joanna", "abc00002"));
        students.add(new Student("Alina", "abc00003"));

        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}