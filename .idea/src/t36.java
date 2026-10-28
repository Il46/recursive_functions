public class t36 {
    public static void main(String[] args) {
        int[] array = {1, 2};
        generateSubsets(array, 0, "");
    }
    public static void generateSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }
        generateSubsets(arr, index + 1, current);
        generateSubsets(arr, index + 1, current.isEmpty() ? String.valueOf(arr[index]) : current + ", " + arr[index]);
    }
}