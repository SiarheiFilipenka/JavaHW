package hw03;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month");

        int monthNumber = scanner.nextInt();

        if (monthNumber == 1) {
            System.out.println("The name of the " + monthNumber + "st month is January");
        } else if (monthNumber == 2) {
            System.out.println("The name of the " + monthNumber + "nd month is February");
        } else if (monthNumber == 3) {
            System.out.println("The name of the " + monthNumber + "rd month is March");
        } else if (monthNumber == 4) {
            System.out.println("The name of the " + monthNumber + "th month is April");
        } else if (monthNumber == 5) {
            System.out.println("The name of the " + monthNumber + "th month is May");
        } else if (monthNumber == 6) {
            System.out.println("The name of the " + monthNumber + "th month is June");
        } else if (monthNumber == 7) {
            System.out.println("The name of the " + monthNumber + "th month is July");
        } else if (monthNumber == 8) {
            System.out.println("The name of the " + monthNumber + "th month is August");
        } else if (monthNumber == 9) {
            System.out.println("The name of the " + monthNumber + "th month is September");
        } else if (monthNumber == 10) {
            System.out.println("The name of the " + monthNumber + "th month is October");
        } else if (monthNumber == 11) {
            System.out.println("The name of the " + monthNumber + "th month is November");
        } else if (monthNumber == 12) {
            System.out.println("The name of the " + monthNumber + "th month is December");
        }
    }
}
