package hw02;

public class TemperatureCheck {

    public static void main(String[] args) {

        int temperature;
        temperature = 80;

        if (temperature<=32)
        {
            System.out.println("The water will frizz with temperature " + temperature);
        }
        else
        {
            System.out.println("The water will NOT frizz with temperature " + temperature);
        }

        if (temperature>=32)
        {
            System.out.println("The temperature is positive");
        }
        else
        {
            System.out.println("The temperature is negative");
        }

        if (temperature%2==0)
        {
            System.out.println("The temperature number is even");
        }
        else
        {
            System.out.println("The temperature number is odd");
        }
    }
}
