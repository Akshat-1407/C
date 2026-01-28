// WAP to find fibonacci series

#include <stdio.h>
int main()
{
    int n1=0, n2=1, n3, n, sum;
    printf("Enter the nth term of series: ");
    scanf("%d", &n);

    printf("%d ", n1);
    printf("%d ", n2);

    for(int i=2; i<n; i++) {
        n3 = n1 + n2;
        printf("%d ", n3);
        n1 = n2;
        n2 = n3;
    }

    return 0;
}
