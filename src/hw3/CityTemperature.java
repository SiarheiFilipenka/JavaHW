package hw3;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your City :");
        String city = scanner.next();

        System.out.println("Please Enter the temperature in Fahrenheit :");
        double temperatureFahrenheit = scanner.nextDouble();

        double temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;

        System.out.println("The temperature in the " + city + " city is " + temperatureCelsius);

    }
}
