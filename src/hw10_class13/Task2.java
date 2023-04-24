package hw10_class13;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to check is it palindrome:");
        String testString = input.nextLine();
        String reverseTestString = "";

        for (int i = testString.length() - 1; i >= 0; i--) {
            reverseTestString += testString.charAt(i);
        }

        testString = testString.replaceAll("\\s+", "");
        reverseTestString = reverseTestString.replaceAll("\\s+", "");

        boolean isPalindrome = testString.equalsIgnoreCase(reverseTestString);

        System.out.println(isPalindrome);
    }
}
