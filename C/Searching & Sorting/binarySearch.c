#include <stdio.h>

int main (void) {
    int n, u, l, arr[100], element, mid, count=0;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the array elements in a sorted manner: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to be searched: ");
    scanf("%d", &element);

    u = n-1;
    l = 0;

    while (l <= u) {

        mid = (u+l)/2;

        if (element == arr[mid]) {
            count++;
            break;
        }
        else if (element < arr[mid]) {
            u = mid - 1;
        }
        else {
            l = mid + 1;
        }
    }
    if (count == 1) {
        printf("Element is found.");
    }
    else {
        printf("Element not found.");
    }
    
    return 0;
}
     
    