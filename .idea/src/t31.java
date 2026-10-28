public class t31 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println("Результат: " + fastPower(base, exponent));
    }
    public static long fastPower(long base, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long half = fastPower(base, n / 2);
            return half * half;
        } else {
            return base * fastPower(base, n - 1);
        }
    }
}