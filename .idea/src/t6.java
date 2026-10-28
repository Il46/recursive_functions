public class t6 {
    public static void main(String[] args) {
        int number = 583;
        System.out.println("Сумма цифр: " + sumDigits(number));
    }
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}