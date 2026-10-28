public class t29 {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";
        System.out.println("Анаграмма: " + areAnagrams(first, second));
    }
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.isEmpty()) return true;
        char c = s1.charAt(0);
        int count1 = countChar(s1, c, 0);
        int count2 = countChar(s2, c, 0);
        if (count1 != count2) return false;
        return areAnagrams(removeChar(s1, c), removeChar(s2, c));
    }
    public static int countChar(String str, char c, int index) {
        if (index == str.length()) return 0;
        return (str.charAt(index) == c ? 1 : 0) + countChar(str, c, index + 1);
    }
    public static String removeChar(String str, char c) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        String rest = removeChar(str.substring(1), c);
        return (first == c ? "" : first) + rest;
    }
}