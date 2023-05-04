package hw13_class16;

public class Task2 {
    private static String onlyVowels(String str) {
        StringBuilder resultString = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                resultString.append(str.charAt(i));
            }
        }
        return resultString.toString();
    }

    public static void main(String[] args) {

        System.out.println(onlyVowels("Hello Batch 16"));
    }
}
