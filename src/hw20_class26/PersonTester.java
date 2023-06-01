package hw20_class26;

import java.util.HashMap;
import java.util.Map;

public class PersonTester {
    public static void main(String[] args) {

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("ABC87236798298", new Person("John", "Wick", 52, 500000));
        personMap.put("DEF79834680436", new Person("Tristan", "Smith", 33, 80000));
        personMap.put("GHI72387573247", new Person("Madeleine", "Clifford", 38, 60000));
        personMap.put("JKL86738932472", new Person("GwenCarter", "Carter", 27, 120000));

        for (Map.Entry<String, Person> e : personMap.entrySet()) {
            System.out.println("Personal ID : " + e.getKey() + ", " + e.getValue().personInfo());
        }
    }
}