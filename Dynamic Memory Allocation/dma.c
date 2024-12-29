// Write a program to find the largest no among 20 integers array using dynamic memory allocation.

#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr;
    int n = 20;
    int largest;

    // Dynamically allocate memory for 20 integers
    arr = (int *)malloc(n * sizeof(int));

    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Input 20 integers
    printf("Enter 20 integers:\n");
    for (int i = 0; i < n; i++) {
        printf("Enter integer %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    // Find the largest number
    largest = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    printf("The largest number is: %d\n", largest);

    // Free the allocated memory
    free(arr);

    return 0;
}
