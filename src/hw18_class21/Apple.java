package hw18_class21;

public class Apple extends Computer {
    public Apple(double price, String model) {
        super(price, model);
    }

    @Override
    public void feature() {
        System.out.println("This model has a Touch Bar");
    }

    public void chip() {
        System.out.println("M2 processor");
    }
}
