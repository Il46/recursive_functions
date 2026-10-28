public class t24 {
    public static void main(String[] args) {
        String text = "Привет мир";
        System.out.println("Количество гласных: " + countVowels(text.toLowerCase(), 0));
    }
    public static int countVowels(String str, int index) {
        if (index == str.length()) return 0;
        char c = str.charAt(index);
        boolean isVowel = "аеёиоуыэюяaeiou".indexOf(c) != -1;
        return (isVowel ? 1 : 0) + countVowels(str, index + 1);
    }
}