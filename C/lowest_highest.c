#include <stdio.h>
//linear search
int main() {
    int arr[] = {10, 5, 20, 15, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    int max = arr[0];
    int min = arr[0];
    
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    
    printf("Highest value in the array: %d\n", max);
    printf("Lowest value in the array: %d\n", min);
    
    return 0;
}