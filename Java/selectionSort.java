public class selectionSort {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;
                }
            }
            int min_value = my_array[min_index];
            for (int k = min_index; k > i; k--) {
                my_array[k] = my_array[k-1];
            }
            my_array[i] = min_value;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}
