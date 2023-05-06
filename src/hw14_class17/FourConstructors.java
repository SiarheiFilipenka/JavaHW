package hw14_class17;

public class FourConstructors {
    int a;
    String s;
    boolean b;

    private FourConstructors(int a) {
        this.a = a;
    }

    public FourConstructors(String s) {
        this.s = s;
    }

    FourConstructors() {

    }

    protected FourConstructors(boolean b) {
        this.b = b;
    }

    public static void main(String[] args) {

        FourConstructors obj1 = new FourConstructors(10);
        FourConstructors obj2 = new FourConstructors("s");
        FourConstructors obj3 = new FourConstructors();
        FourConstructors obj4 = new FourConstructors(false);

    }
}
