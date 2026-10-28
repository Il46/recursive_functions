public class t14 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        System.out.println("Минимум массива: " + minArray(array, 0));
    }
    public static int minArray(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int minRest = minArray(arr, index + 1);
        return arr[index] < minRest ? arr[index] : minRest;
    }
}