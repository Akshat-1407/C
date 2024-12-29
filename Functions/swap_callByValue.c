// Swapping using call by value

# include <stdio.h> 

void swap(int, int);

int main() {
    int a, b;
    printf("Enter the value of a and b: ");
    scanf("%d %d", &a, &b);

    printf("\nValue of a, b before swapping is %d, %d.", a, b);

    swap(a, b);

    printf("\nValue of a, b after swapping is %d, %d.", a, b);

}

void swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
}
