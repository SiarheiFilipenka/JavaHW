package hw07;

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        int largestNumber = numbers[0];
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println();
        System.out.println("Largest number is " + largestNumber);
    }
}
