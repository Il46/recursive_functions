public class t1 {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(1, n);
    }
    public static void printNumbers(int current, int target) {
        if (current > target) return;
        System.out.println("Число: " + current);
        printNumbers(current + 1, target);
    }
}