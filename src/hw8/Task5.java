package hw8;

public class Task5 {

    public static void main(String[] args) {

        int[][] numbers = {
                {11, 5, -8, 3},
                {-1, 0, 4, 7},
                {12, -15, 2, 4}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
