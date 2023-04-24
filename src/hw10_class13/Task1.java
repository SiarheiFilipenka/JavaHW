package hw10_class13;

public class Task1 {

    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";
        String[] words = str.split(" ");

        StringBuilder reverseStr = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            reverseStr.append(reverseWord).append(" ");
        }
        String str1 = reverseStr.toString().trim();
        System.out.println(str1);
    }
}
