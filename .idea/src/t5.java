public class t5 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println("Результат: " + power(base, exponent));
    }
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}