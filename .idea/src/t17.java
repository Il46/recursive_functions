public class t17 {
    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("НОД: " + gcd(a, b));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}