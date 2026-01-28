#include <stdio.h>

int main(void) {

    int num, flag=0;
    
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num == 0 || num == 1) {
        flag++;
    }
    for (int i=2; i<num/2; i++) {
        if (num % i == 0) {
            flag++;
            break;
        }
    }

    if (flag==0) {
        printf("It is a prime number.\n");
    }
    else {
        printf("It is not a prime number.\n");
    }
    

    return 0;
}