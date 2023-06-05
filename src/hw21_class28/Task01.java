package hw21_class28;

public class Task01 {

    public static void ageEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age less than 16 is not eligible.");
        } else {
            System.out.println("Age is eligible.");
        }
    }
}