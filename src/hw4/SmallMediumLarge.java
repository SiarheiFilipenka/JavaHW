package hw4;

import java.util.Scanner;

public class SmallMediumLarge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an any positive number");
        int number = input.nextInt();

        if (number >= 1 && number < 11) {
            System.out.println("Number is small");
        } else if (number >= 11 && number < 101) {
            System.out.println("Number is medium");
        } else if (number >= 101 && number < 1001) {
            System.out.println("Number is large");
        } else {
            System.out.println("Invalid number");
        }
    }
}
