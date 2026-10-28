public class t9 {
    public static void main(String[] args) {
        int number = 583;
        System.out.println("Максимальная цифра: " + maxDigit(number));
    }
    public static int maxDigit(int n) {
        if (n < 10) return n;
        int current = n % 10;
        int maxRest = maxDigit(n / 10);
        return current > maxRest ? current : maxRest;
    }
}