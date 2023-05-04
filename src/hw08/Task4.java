package hw08;

public class Task4 {

    public static void main(String[] args) {

        int[][] numbers = {
                {11, 5, -8},
                {-1, 0, 4},
                {12, -15, 2}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Sum of all array elements is equal to " + sum);
    }
}
