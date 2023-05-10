package hw16_class19;

public class Task3 {
    static void areaCalc(double a, double b) {
        System.out.println(a * b);
    }

    static void areaCalc(double r) {
        System.out.println(3.14 * r * r);
    }

    static void areaCalc(double r, double a, double b, double c) {
        System.out.println(2 * r * r * Math.sin(a) * Math.sin(b) * Math.sin(c));
    }

    public static void main(String[] args) {
        areaCalc(5, 6);
        areaCalc(7.5);
        areaCalc(8, 30, 40, 110);
    }
}
