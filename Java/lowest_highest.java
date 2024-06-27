public class lowest_highest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 8};
        
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
        
        System.out.println("Highest value in the array: " + max);
        System.out.println("Lowest value in the array: " + min);
    }
}
