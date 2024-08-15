public class ArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 2};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest Element: " + max);
        System.out.println("Smallest Element: " + min);
    }
}

