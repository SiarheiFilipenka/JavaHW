package hw1;

public class VariablesTask2 {

    public static void main(String[] args) {

        String firstName="John";
        String lastName="Wick";
        char grade='A';
        String city="New York";
        String state="NY";
        String phoneNumber="(512) 777 55 71";

        System.out.println("My name is"+" "+firstName+" "+"and my last name is"+" "+lastName+'.');
        System.out.println("I'm"+" "+grade+" "+"student"+'.');
        System.out.println("I live in"+" "+city+" "+"city"+" "+"and state"+" "+state+'.');
        System.out.println("And my phone number is"+" "+phoneNumber+'.');

        grade='B';
        city="Austin";
        state="TX";
        phoneNumber="";

        System.out.println();
        System.out.println("My name is"+" "+firstName+" "+lastName+" "+"and i moved to"+" "+city+" "+state+" "+"state.");
        System.out.println("My new phone number is"+" "+phoneNumber+'.');
    }
}
