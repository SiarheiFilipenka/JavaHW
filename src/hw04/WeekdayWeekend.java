package hw04;

import java.util.Scanner;

public class WeekdayWeekend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number of day:");
        int dayNumber = input.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("It is a weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("invalid day");
        }
    }
}
