public class t19 {
    public static void main(String[] args) {
        int number = 10;
        System.out.print("Двоичное представление: ");
        toBinary(number);
        System.out.println();
    }
    public static void toBinary(int n) {
        if (n == 0) return;
        toBinary(n / 2);
        System.out.print(n % 2);
    }
}