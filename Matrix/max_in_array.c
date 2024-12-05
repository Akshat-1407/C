#include <stdio.h>

int main(void) {
    int arr[100], n, max, loc;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the array elements: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    max = arr[0];

    for (int i=0; i<n; i++) {
        if (arr[i]>=max) {
            max = arr[i];
            loc = i+1;
        }
    }
    printf("The maximum number is %d at location %d\n", max, loc);

    return 0;
}