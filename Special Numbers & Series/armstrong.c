#include <stdio.h>
#include <math.h>

int main(void) {

    int n, d, temp, sum=0;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while (n > 0) {
        d = n % 10;
        sum = sum + pow(d, 3);
        n = n / 10;
    }
    
    if (sum == temp) {
        printf("%d is a armstrong number.", temp);
    }
    else {
        printf("%d is not a armstrong number.", temp);
    }

    return 0;
}
