package hw4;

import java.util.Scanner;

public class CountryLanguage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your country:");
        String country = input.nextLine();

        String language;

        switch (country) {
            case "United States":
            case "United Kingdom":
            case "Canada":
            case "Australia":
                language = "English";
                break;
            case "Spain":
            case "Mexico":
                language = "Spanish";
                break;
            case "Belarus":
            case "Russia":
                language = "Russian";
                break;
            case "Ukraine":
                language = "Ukrainian";
                break;
            case "China":
                language = "Chinese";
                break;
            default:
                language = "undefined";
        }
        System.out.println("The language in your country is " + language);
    }
}
