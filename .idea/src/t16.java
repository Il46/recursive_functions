public class t16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Отсортирован по возрастанию: " + isAscending(array, 0));
    }
    public static boolean isAscending(int[] arr, int index) {
        if (index >= arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isAscending(arr, index + 1);
    }
}