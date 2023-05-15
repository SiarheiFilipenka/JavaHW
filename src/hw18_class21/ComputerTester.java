package hw18_class21;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] computers = {
                new Apple(2499.00, "M2 Pro 14''"),
                new Lenovo(1309.99, "Yoga 9i"),
                new HP(1799.99, "Spectre X360"),
                new Dell(2349.00, "XPS 15")
        };
        for (Computer computer : computers) {
            computer.printInfo();
            computer.feature();
            if (computer instanceof Apple) {
                ((Apple) computer).chip();
            }
            System.out.println("===================================================");
        }
    }
}
