package main.org.example;

import main.org.example.reverse.Reverse;

public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        String result = Reverse.reverseLetters(text);
        System.out.println("Input: " + text);
        System.out.println("Output: " + result);
    }

}