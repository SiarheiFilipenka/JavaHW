package hw17_class20;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(2875.52);
        Visa visa = new Visa(458.30);
        AX ax = new AX(155.5);

        creditCard.interestCalc();
        visa.interestCalc();
        ax.interestCalc();
    }
}
