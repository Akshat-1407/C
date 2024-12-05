#include <stdio.h>

int main (void) {
    int arr[100], n, temp;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    for (int p = 0; p < n-1; p++) {
        for (int s = 0; s < n-p-1; s++) {
            if (arr[s] > arr[s+1]) {
                temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
        }
    }

    for (int j = 0; j < n; j++) {
        printf("%d ", arr[j]);
    }
    
    return 0;
}