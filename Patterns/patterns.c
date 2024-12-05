#include <stdio.h>

void pattern_1(int n);
void pattern_2(int n);
void pattern_3(int n);
void pattern_4(int n);
void pattern_5(int n);
void pattern_6(int n);
void pattern_7(int n);
void pattern_8(int n);
void pattern_9(int n);
void pattern_10(int n);

int main(void) {
    int n;
    printf("Enter the height of the pattern: ");
    scanf("%d", &n);

    pattern_5(n);

}

void pattern_1(int n) {

    // *****
    // *****
    // *****
    // *****
    // *****

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("*");
        }
        printf("\n");
    } 
}


void pattern_2(int n) {

    // *
    // **
    // ***
    // ****
    // *****

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
}

void pattern_3(int n) {

    // *****
    // ****
    // ***
    // **
    // *

    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= i; j--) {
            printf("*");
        }
        printf("\n");
    }
}

void pattern_4(int n) {

    //     *
    //    **
    //   ***
    //  ****
    // *****

    for (int row=1; row <= n; row++) {
        for (int cols=n; cols>=row; cols--) {
            printf(" ");
        }
        for (int cols=1; cols<=row; cols++) {
            printf("*");
        }
        printf("\n");
    }   
}

void pattern_5(int n) {

    // *****
    //  ****
    //   ***
    //    **
    //     *

    for (int row=1; row<=n; row++) {
        for (int cols=1; cols<=row; cols++) {
            printf(" ");
        }
        for (int cols=n; cols>=row; cols--) {
            printf("*");
        }
        printf("\n");
    }
}

void pattern_6(int n) {

    //     *
    //    ***
    //   *****
    //  *******
    // *********

    for (int row=1; row<=n; row++) {
        for (int cols=n; cols>=row; cols--) {
            printf(" ");
        }
        // for (int cols=1; cols<=n-row; cols++) {
        //     printf(" ");
        // }
        for (int cols=1; cols<=2*row-1; cols++) {
            printf("*");
        }
        printf("\n");
    }
}

void pattern_7(int n) {

    // 1
    // 12
    // 123
    // 1234
    // 12345

    for (int i=1; i<=n; i++) {
        for (int j=1; j<=i; j++) {
            printf("%d", j);
        }
        printf("\n");
    }
}

void pattern_8(int n) {

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2 
    // 1

    for (int i=1; i<=n; i++) {
        for (int j=1; j<=n-i+1; j++) {
            printf("%d", j);
        }
        printf("\n");
    }
}

void pattern_9(int n) {

    // A
    // A B 
    // A B C 
    // A B C D

    for (int i=0; i<n; i++) {
        for (int j=0; j<=i; j++) {
            printf("%c ", j+65);
        }
        printf("\n");
    }
}

void pattern_10(int n) {

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    int count = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j<=i; j++) {
            printf("%d ", count);
            count++;
        }
        printf("\n");
    }
    

}
