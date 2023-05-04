package hw03;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age :");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! Your driver's license will be mailed to you within 10 business days.");
        } else {
            System.out.println("Unfortunately you need to get a learner permit at first.");
        }
    }
}
