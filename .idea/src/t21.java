public class t21 {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println("Перевернутая строка: " + reverse(text));
    }
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}