package hw7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] cars = new String[6];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = input.next();
        }

        for (int j = 0; j < cars.length; j++) {
            System.out.print(cars[j] + " ");
        }
        System.out.println();
        int a = 0;

        while (a < cars.length) {
            System.out.print(cars[a] + " ");
            a++;
        }
    }
}
