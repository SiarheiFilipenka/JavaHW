package hw04;

import java.util.Scanner;

public class GradeExplanation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your grade:");
        char grade = input.next().charAt(0);

        String explanation;

        switch (grade) {
            case 'A':
                explanation = "Excellent";
                break;
            case 'B':
                explanation = "Good";
                break;
            case 'C':
                explanation = "Average";
                break;
            case 'D':
                explanation = "Bad";
                break;
            default:
                explanation = "Not Acceptable";
        }

        System.out.println("Your grade is " + explanation);
    }
}
