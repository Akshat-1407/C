#include <stdio.h>

int main() {
    int n, factorial=1;
    printf("Enter the number whose factorial has to be calculated: ");
    scanf("%d", &n);

    for (int i=n; i>0; i--) {
        factorial = factorial*i;
    }
    printf("%d! = %d\n", n, factorial);
}