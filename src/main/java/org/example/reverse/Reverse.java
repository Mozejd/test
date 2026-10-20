package main.java.org.example.reverse;

public class Reverse {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        String result = reverseLetters(text);
        System.out.println("Input: " + text);
        System.out.println("Output: " + result);
    }

    public static String reverseLetters(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            }
            else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
