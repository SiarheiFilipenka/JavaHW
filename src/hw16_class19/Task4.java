package hw16_class19;

public class Task4 {
    private void areaCalc(double a, double b) {
        System.out.println(a * b);
    }

    private void areaCalc(double r) {
        System.out.println(3.14 * r * r);
    }

    private void areaCalc(double r, double a, double b, double c) {
        System.out.println(2 * r * r * Math.sin(a) * Math.sin(b) * Math.sin(c));
    }

    public static void main(String[] args) {
        Task4 obj = new Task4();
        obj.areaCalc(5, 6);
        obj.areaCalc(7.5);
        obj.areaCalc(8, 30, 40, 110);
    }
}
