package hw9_class12;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.next();

        if (!word.isBlank() && word.length() >= 3 && word.length() % 2 != 0) {
            System.out.println("The middle character is  - " + word.charAt(word.length() / 2));
        } else {
            System.out.println("You entered an incorrect word");
        }
    }
}
