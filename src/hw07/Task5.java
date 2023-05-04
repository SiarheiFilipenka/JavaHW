package hw07;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] animals = new String[5];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = input.next();
        }

        for (int j = 0; j < animals.length; j++) {
            System.out.print(animals[j] + " ");
        }
        System.out.println();
        int a = 0;

        while (a < animals.length) {
            System.out.print(animals[a] + " ");
            a++;
        }
    }
}
