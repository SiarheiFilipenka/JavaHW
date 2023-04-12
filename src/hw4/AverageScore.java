package hw4;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quiz score:");
        double quizScore = input.nextDouble();
        System.out.println("Enter the mid term score:");
        double midTermScore = input.nextDouble();
        System.out.println("Enter final score:");
        double finalScore = input.nextDouble();

        double averageScore = (quizScore + midTermScore + finalScore) / 3;
        char grade;

        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore < 90 && averageScore >= 70) {
            grade = 'B';
        } else if (averageScore < 70 && averageScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);
    }
}
