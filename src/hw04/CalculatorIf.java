package hw04;

import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = input.nextDouble();
        System.out.println("Enter operator");
        char operator = input.next().charAt(0);
        System.out.println("Enter second number");
        double number2 = input.nextDouble();

        double result;

        if (operator == '+') {
            result = number1 + number2;
            System.out.println(result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println(result);
        } else {
            System.out.println("Invalid operator");
        }

    }

}
