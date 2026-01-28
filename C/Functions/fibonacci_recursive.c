#include <stdio.h>

// Function to calculate Fibonacci number recursively
int fibonacci(int n) {
    if (n <= 1) {
        return n; // Base case: return 0 for n=0, and 1 for n=1
    }
    return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

// Function to print the Fibonacci series up to n terms
void printFibonacci(int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", fibonacci(i)); // Print each Fibonacci number
    }
    printf("\n");
}

int main() {
    int n;
    printf("Enter the number of terms in Fibonacci series: ");
    scanf("%d", &n);

    printf("Fibonacci series up to %d terms: ", n);
    printFibonacci(n); // Function to print the Fibonacci series

    return 0;
}
