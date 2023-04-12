package hw7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String[] group12 = {"Inessa", "Karen", "Luis", "Ouma", "Tsanita", "Yauhenia", "Youmna", "Zibeyda", "Hamdan", "Siarhei", "Vonny"};
        System.out.println(group12[9]);

        Scanner input = new Scanner(System.in);
        String[] newGroup12 = new String[11];
        for (int i = 0; i < newGroup12.length; i++) {
            newGroup12[i] = input.next();
        }
        System.out.println(newGroup12[0]);

    }
}
