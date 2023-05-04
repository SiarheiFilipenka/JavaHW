package hw03;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the loan amount you want $:");
        int loanAmount = scanner.nextInt();

        if (loanAmount <= 200000) {
            System.out.println("Your loan has been approved. We will email you a contract to sign.");
        } else {
            System.out.println("Unfortunately you were denied loan.");
        }
    }
}
