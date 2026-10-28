public class t28 {
    public static void main(String[] args) {
        String text = "тестовая строка с пробелами";
        System.out.println("Количество слов: " + countWords(text.trim()));
    }
    public static int countWords(String str) {
        if (str.isEmpty()) return 0;
        int spaceIndex = str.indexOf(' ');
        if (spaceIndex == -1) return 1;
        return 1 + countWords(str.substring(spaceIndex + 1).trim());
    }
}