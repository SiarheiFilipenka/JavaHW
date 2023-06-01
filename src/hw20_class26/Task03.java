package hw20_class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("String1");
        stringSet.add("String2");
        stringSet.add("String1");
        stringSet.add("String3");
        stringSet.add("String4");
        stringSet.add("String5");
        stringSet.add("String6");
        stringSet.add("String3");

        String concat = "";

        for (String s : stringSet) {
            concat += s;
        }

        System.out.println(concat);
    }
}