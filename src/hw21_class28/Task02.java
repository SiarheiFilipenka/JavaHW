package hw21_class28;

public class Task02 {
    public static void checkUserName(String userName) {
        if (userName.length() < 5) {
            throw new RuntimeException("Entered username is less than 5 characters.");
        } else {
            System.out.println("Username is available");
        }
    }

    public static void main(String[] args) {

        checkUserName("Blizz");
    }
}