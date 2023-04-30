package hw11_class14;

public class Task2 {

    void email(String firstName, String lastName, String emailType) {
        String newEmail = firstName + lastName + "@" + emailType + ".com";
        System.out.println(newEmail.toLowerCase());
    }

    public static void main(String[] args) {

        Task2 obj = new Task2();

        obj.email("John", "Wick", "yahoo");
    }
}
