public class t8 {
    public static void main(String[] args) {
        int number = 234;
        System.out.println("Произведение цифр: " + productDigits(number));
    }
    public static int productDigits(int n) {
        if (n == 0) return 1;
        if (n < 10) return n;
        return (n % 10) * productDigits(n / 10);
    }
}