package hw18_class21;

public class Dell extends Computer {
    public Dell(double price, String model) {
        super(price, model);
    }

    @Override
    public void feature() {
        System.out.println("This model is made with premium materials and is precision cut to achieve an elegant finish look—all in a durable, lightweight design.");
    }
}
