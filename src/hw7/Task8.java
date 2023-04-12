package hw7;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        char[] letters = new char[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < letters.length; i++) {
            letters[i] = input.next().charAt(0);
        }
        System.out.println();
        for (int j = letters.length - 1; j >= 0; j--) {
            System.out.print(letters[j] + " ");
        }
    }
}
