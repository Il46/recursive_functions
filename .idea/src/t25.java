public class t25 {
    public static void main(String[] args) {
        String text = "banana";
        char target = 'a';
        System.out.println("Результат: " + removeChar(text, target));
    }
    public static String removeChar(String str, char c) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        String rest = removeChar(str.substring(1), c);
        return (first == c ? "" : first) + rest;
    }
}