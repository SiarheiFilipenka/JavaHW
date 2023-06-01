package hw20_class26;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();
        employee.put("John Wick", 1000);
        employee.put("Sabrina Fisher", 120000);
        employee.put("Bridget Clapton", 1450000);
        employee.put("Paul Calhoun", 50000);
        employee.put("Jennifer Collins", 90000);

        String richestEmployee = null;
        Integer maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : employee.entrySet()) {
            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                richestEmployee = e.getKey();
            }
        }
        System.out.println(richestEmployee + "=$" + maxValue);
    }
}