package ReverseLetter;

public class ReverseLetter {
    public static void main(String[] args) {
        String s = "J@va the be$t!123";
        char [] chars = s.toCharArray();
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
        String result = new String(chars);
        System.out.println("Imput: " + s);
        System.out.println("Output: " + result);
    }
}
