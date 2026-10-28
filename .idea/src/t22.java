public class t22 {
    public static void main(String[] args) {
        String word = "казак";
        System.out.println("Палиндром: " + isPalindrome(word));
    }
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}