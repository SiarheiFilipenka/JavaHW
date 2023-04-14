package hw8;

public class Task2 {

    public static void main(String[] args) {

        String[][] cars = {
                {"Ford", "Lincoln", "Cadillac", "Chevrolet", "Jeep"},
                {"BMW", "Audi", "Mercedes", "Volkswagen"},
                {"KIA", "Genesis", "Hyundai"},
                {"Ferrari", "Maserati", "Alfa Romeo", "Lamborghini", "Pagani"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("====================================================");

        int i = 0;

        while (i < cars.length) {
            int j = 0;
            while (j < cars[i].length) {
                System.out.print(cars[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
