package hw18_class21;

public abstract class Computer {
    private double price;
    private String model;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public void printInfo() {
        System.out.println("Model : " + model);
        System.out.println("price : " + price);
    }

    public abstract void feature();
}
