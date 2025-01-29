// Write a program to find the maximum element in the array.

#include <stdio.h>

int main() {
    int arr[100], n;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the aray: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }
    // Maximum in array
    int max = arr[0];
    for (int i=0; i<n; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
    }

    printf("The maximum element is %d", max);

    return 0;
}