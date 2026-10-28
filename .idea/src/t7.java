public class t7 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Количество цифр: " + countDigits(number));
    }
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
}