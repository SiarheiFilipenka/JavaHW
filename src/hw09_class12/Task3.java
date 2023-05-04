package hw09_class12;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the mom's first name:");
        String momsName = input.next();
        System.out.println("Please enter the dad's first name:");
        String dadsName = input.next();
        System.out.println("Please choose the baby gender (boy or girl):");
        String gender = input.next();

        if (gender.equals("boy")) {
            System.out.println("Suggested baby name: " + dadsName.toUpperCase().substring(0, dadsName.length() / 2) + momsName.toUpperCase().substring(momsName.length() / 2));
        } else if (gender.equals("girl")) {
            System.out.println("Suggested baby name: " + momsName.toUpperCase().substring(0, momsName.length() / 2) + dadsName.toUpperCase().substring(dadsName.length() / 2));
        }
    }
}
