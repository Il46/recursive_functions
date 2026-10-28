public class t15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        System.out.println("Количество чётных: " + countEven(array, 0));
    }
    public static int countEven(int[] arr, int index) {
        if (index == arr.length) return 0;
        return (arr[index] % 2 == 0 ? 1 : 0) + countEven(arr, index + 1);
    }
}