#include <stdio.h>

int main() {
    int arr[10], n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Insertion sort
    for (int i = 1; i < n; i++) {
        int curr = arr[i];
        int prev = i-1;
        // finding the correct position to insert
        while(prev >= 0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1] = curr;
    }

    // Printing sorted array
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    
    return 0;
}