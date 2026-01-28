// WAP to check whether the number is strong or not.

#include <stdio.h>

int main(void) {
    int n, d, temp, ans=0;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while (n > 0) {
        d = n % 10;
        int fact = 1;
        for (int i=d; i>0; i--) {
            fact = fact * i;
        }
        ans = ans + fact;
        n = n / 10;
    }

    if (temp == ans) {
        printf("%d is a strong number: ", temp);
    }
    else {
        printf("%d is not a strong number: ", temp);
    }
    
}