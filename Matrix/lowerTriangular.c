#include <stdio.h> 

int main(void) {
    int a[10][10], b[10][10], n, m;

    printf("Enter the order of matrix: ");
    scanf("%d %d",&m, &n);

    printf ("Enter the elements of matrix: ");
    for (int i=0; i<m; i++) {
        for (int j=0; j<n; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    // converting into upper triangular matrix
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            if (i<j) {
                a[i][j] = 0;
            }
        }
    }

    // printing resultant matrix
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }

}
