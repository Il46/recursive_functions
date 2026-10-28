public class t32 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("Индекс элемента: " + binarySearch(array, target, 0, array.length - 1));
    }
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
        return binarySearch(arr, target, mid + 1, right);
    }
}