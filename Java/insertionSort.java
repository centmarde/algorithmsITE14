public class insertionSort {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};

        int n = myArray.length;
        for (int i = 1; i < n; i++) {
            int insertIndex = i;
            int currentValue = myArray[i];
            int j = i - 1;
            
            while (j >= 0 && myArray[j] > currentValue) {
                myArray[j + 1] = myArray[j];
                insertIndex = j;
                j--;
            }
            myArray[insertIndex] = currentValue;
        }

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
