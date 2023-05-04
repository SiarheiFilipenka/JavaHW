package hw08;

public class Task3 {

    public static void main(String[] args) {

        String[][] grocery = {
                {"Tomatoes", "Cucumbers", "Broccoli", "Cabbage", "Carrot"},
                {"Pineapple", "Mango", "Banana"},
                {"Milk", "Sour cream", "Yogurt"},
                {"Cheese cake", "Candies", "Ice cream"}
        };

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("====================================================");

        int i = 0;

        while (i < grocery.length) {
            int j = 0;
            while (j < grocery[i].length) {
                System.out.print(grocery[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
