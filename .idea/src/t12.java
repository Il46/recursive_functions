public class t12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Сумма элементов: " + sumArray(array, 0));
    }
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }
}