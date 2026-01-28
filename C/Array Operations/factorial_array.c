// Program to find the factorial of all the elemets in the array.

#include <stdio.h>
 
int main() {
    int arr[100], n;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the aray: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    // Factorial of all the elements

    for (int i = 0; i < n; i++) {
        int fact = 1;
        for (int j = 1; j <= arr[i]; j++) {
            fact *= j;
        }
        printf("The factorial of %d is %d\n", arr[i], fact);
    }

    return 0;
}