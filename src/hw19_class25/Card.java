package hw19_class25;

public class Card {
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public void printInfo() {
        System.out.println("Card type : " + cardType + ". Interest rate : " + interestRate + ".");
    }
}