package hw17_class20;

public class CreditCard {
    protected double balance;
    protected double interest = 0.2;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    void interestCalc() {
        System.out.println("Your interest : " + (balance * interest));
    }
}

class Visa extends CreditCard {
    public Visa(double balance) {
        super(balance);
    }
}

class AX extends CreditCard {
    public AX(double balance) {
        super(balance);
    }

    void interestCalc() {
        System.out.println("Your interest : " + (balance * interest * 1.2));
    }
}