public class t35 {
    public static void main(String[] args) {
        int disks = 3;
        hanoi(disks, 'A', 'C', 'B');
    }
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Переместить диск 1 с " + from + " на " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Переместить диск " + n + " с " + from + " на " + to);
        hanoi(n - 1, aux, to, from);
    }
}