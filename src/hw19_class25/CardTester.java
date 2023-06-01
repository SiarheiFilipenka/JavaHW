package hw19_class25;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardTester {
    public static void main(String[] args) {

        Card amex = new Card(26.99, "AMEX");
        Card city = new Card(24.00, "City visa");
        Card chase = new Card(24.99, "Chase visa");

        List<Card> cards = new LinkedList<>();
        cards.add(amex);
        cards.add(city);
        cards.add(chase);

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).printInfo();
        }

        System.out.println("==========================================================");

        for (Card card : cards) {
            card.printInfo();
        }

        System.out.println("==========================================================");

        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            iterator.next().printInfo();
        }
    }
}