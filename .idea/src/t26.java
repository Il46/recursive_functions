public class t26 {
    public static void main(String[] args) {
        String text = "banana";
        char target = 'a';
        char replacement = 'o';
        System.out.println("Результат: " + replaceChar(text, target, replacement));
    }
    public static String replaceChar(String str, char target, char replacement) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        String rest = replaceChar(str.substring(1), target, replacement);
        return (first == target ? replacement : first) + rest;
    }
}