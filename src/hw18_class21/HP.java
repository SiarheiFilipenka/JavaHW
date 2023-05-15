package hw18_class21;

public class HP extends Computer {
    public HP(double price, String model) {
        super(price, model);
    }

    @Override
    public void feature() {
        System.out.println("This model has an OLED display");
    }
}
