#include <stdio.h>

int main(void) {

    int n, d, temp, rev=0;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while (n > 0) {
        d = n % 10;
        rev = rev*10+d;
        n = n / 10;
    }
    
    if (rev==temp) {
        printf("%d is a palendrome.", temp);
    }
    else {
        printf("%d is not a palendrome.", temp);
    }

    return 0;
}
