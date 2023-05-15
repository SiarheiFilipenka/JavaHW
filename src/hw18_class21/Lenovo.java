package hw18_class21;

public class Lenovo extends Computer {
    public Lenovo(double price, String model) {
        super(price, model);
    }

    @Override
    public void feature() {
        System.out.println("Contemporary 2 in 1 design includes garaged pen & rotating soundbar");
    }
}
