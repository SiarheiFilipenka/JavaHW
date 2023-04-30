package hw11_class14;

public class Task3 {

    boolean primeOrNot(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Task3 obj = new Task3();

        System.out.println(obj.primeOrNot(15));
    }
}
