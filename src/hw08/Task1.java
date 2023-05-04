package hw08;

public class Task1 {

    public static void main(String[] args) {

        String[][] namesGrades = {
                {"John", "Barbara", "Mike", "Stacy"},
                {"D", "A", "B", "C"}
        };

        for (int i = 0; i < namesGrades[1].length; i++) {
            if (namesGrades[1][i].equals("A") || namesGrades[1][i].equals("B")) {
                System.out.println(namesGrades[0][i] + "'s grade is " + namesGrades[1][i]);
            }
        }
    }
}
