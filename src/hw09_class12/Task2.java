package hw09_class12;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = input.next();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
