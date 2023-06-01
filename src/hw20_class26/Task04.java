package hw20_class26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(20));
        }

        System.out.println(integerList);

        int listSum = 0;

        for (Integer i : integerList) {
            listSum += i;
        }

        System.out.println("Sum of the List elements is = " + listSum);
    }
}