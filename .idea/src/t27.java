public class t27 {
    public static void main(String[] args) {
        String text = "aaaaa";
        System.out.println("Одинаковые символы: " + allSame(text, 0));
    }
    public static boolean allSame(String str, int index) {
        if (index >= str.length() - 1) return true;
        if (str.charAt(index) != str.charAt(index + 1)) return false;
        return allSame(str, index + 1);
    }
}