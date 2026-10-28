public class t30 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abd";
        System.out.println("Результат сравнения: " + compareStrings(s1, s2, 0));
    }
    public static int compareStrings(String s1, String s2, int index) {
        if (index == s1.length() && index == s2.length()) return 0;
        if (index == s1.length()) return -1;
        if (index == s2.length()) return 1;
        char c1 = s1.charAt(index);
        char c2 = s2.charAt(index);
        if (c1 != c2) return c1 - c2;
        return compareStrings(s1, s2, index + 1);
    }
}