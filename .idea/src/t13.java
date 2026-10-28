public class t13 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 4, 2};
        System.out.println("Максимум массива: " + maxArray(array, 0));
    }
    public static int maxArray(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int maxRest = maxArray(arr, index + 1);
        return arr[index] > maxRest ? arr[index] : maxRest;
    }
}