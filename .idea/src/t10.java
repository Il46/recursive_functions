public class t10 {
    public static void main(String[] args) {
        int number = 583;
        System.out.println("Минимальная цифра: " + minDigit(number));
    }
    public static int minDigit(int n) {
        if (n < 10) return n;
        int current = n % 10;
        int minRest = minDigit(n / 10);
        return current < minRest ? current : minRest;
    }
}