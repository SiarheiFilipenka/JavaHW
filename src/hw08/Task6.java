package hw08;

public class Task6 {
    public static void main(String[] args) {

        String[][] countries = {
                {"United States", "Canada", "Mexico", "Costa Rica", "Guatemala"},
                {"Brazil", "Peru", "Argentina", "Chili"},
                {"France", "UK", "Germany", "Belarus", "Poland"},
                {"Japan", "China", "South Korea", "Thailand", "India", "Nepal"},
                {"South Africa", "Angola", "Egypt", "Kenya", "Morocco"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("====================================================");

        int a = 0;

        while (a < countries.length) {
            int b = 0;
            while (b < countries[a].length) {
                System.out.print(countries[a][b] + " ");
                b++;
            }
            a++;
            System.out.println();
        }

        System.out.println("====================================================");

        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            sum += countries[i].length;
        }
        System.out.println("The number of countries in the array is " + sum);
    }
}
