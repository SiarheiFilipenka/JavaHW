package hw7;

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
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > largestNumber) {
                largestNumber = numbers[j];
            }
        }
        System.out.println();
        System.out.println("Largest number is " + largestNumber);
    }
}
