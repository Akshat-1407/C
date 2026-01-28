#include <stdio.h>

int main (void) {
    int n, arr[100], element, flag=0;
    
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the array elements: ");
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to be searched: ");
    scanf("%d", &element);

    for (int j=0; j<n; j++) {
        if (element == arr[j]) {
            flag++;
        } 
    }
    if (flag==0) {
        printf("Element not found.");
    }
    else {
        printf("Element is found %d times", flag);
    }
    return 0;
}