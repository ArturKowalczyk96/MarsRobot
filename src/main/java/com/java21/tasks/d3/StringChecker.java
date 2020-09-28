package com.java21.tasks.d3;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister always pays his debts.";
        System.out.println("Text is: " + str);
        System.out.println("Length of text: "
                + str.length());
        System.out.println("Char on position 6.: "
                + str.charAt(6));
        System.out.println("Fragment from char 10. to 16.: "
                + str.substring(10, 16));
        System.out.println("Index of first letter 't': "
                + str.indexOf('t'));
        System.out.println("Index begining of subtext "
                + "\"debts\": " + str.indexOf("debts"));
        System.out.println("Text written in capital letters: "
                + str.toUpperCase());
    }
}
