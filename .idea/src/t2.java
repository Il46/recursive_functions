public class t2 {
    public static void main(String[] args) {
        int n = 5;
        printReverse(n);
    }
    public static void printReverse(int current) {
        if (current < 1) return;
        System.out.println("Число: " + current);
        printReverse(current - 1);
    }
}