public class t20 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Сумма квадратов: " + sumSquares(n));
    }
    public static int sumSquares(int n) {
        if (n <= 1) return 1;
        return (n * n) + sumSquares(n - 1);
    }
}