// Write a program to calculate power without using power function

#include <stdio.h>

int main() {
    int power, base, ans;

    printf("Enter the Base: ");
    scanf("%d", &base);

    printf("Enter the Power: ");
    scanf("%d", &power);

    ans =  1;

    for (int i = 0; i < power; i++) {
        ans = ans*base;
    }
    
    printf("%d ^ %d = %d\n", base, power, ans);
}