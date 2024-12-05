#include <stdio.h>

int main(void) {
    int num, sum=0, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;

    for (int i=1; i<num; i++) {
        if(num % i== 0) {
            sum += i;
        }
    }
    if (sum == temp) {
        printf("It is a perfect number.");
    }
    else {
        printf("It is not a perfect number.");
    }
    return 0;
}
