#include <stdio.h> 

int main(void) {
    int a[10][10], b[10][10], n, flag=0;

    printf("Enter the order of matrix: ");
    scanf("%d", &n);

    printf ("Enter the elements of matrix: ");
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    // taking transpose
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            b[i][j] = a[j][i];
        }
    }

    // checking symmetricity
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (b[i][j] == (-1*a[i][j])) {
                flag++;
            } 
        }
    }
    
    if (flag == 9) {
        printf("It is a skew-symmetric matrix.");
    }
    else {
        printf("It is not a skew-symmetric matrix.");
    }
}
