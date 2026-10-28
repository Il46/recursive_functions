public class t23 {
    public static void main(String[] args) {
        String text = "banana";
        char target = 'a';
        System.out.println("Количество вхождений: " + countChar(text, target, 0));
    }
    public static int countChar(String str, char c, int index) {
        if (index == str.length()) return 0;
        return (str.charAt(index) == c ? 1 : 0) + countChar(str, c, index + 1);
    }
}