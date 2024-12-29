// Write a program to find the sum of digits of a 5-digit number using command line argument.

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    // Check if the correct number of arguments is provided
    if (argc != 2) {
        printf("Incorrect Command line arguments are given.");
        return 1;
    }

    // Convert the command-line argument to an integer
    int number = atoi(argv[1]);
    int sum = 0;

    // Check if the number is a 5-digit number
    if (number < 10000 || number > 99999) {
        printf("Error: Please enter a 5-digit number.\n");
        return 1;
    }

    // Calculate the sum of digits
    while (number > 0) {
        sum += number % 10; // Add the last digit
        number /= 10;       // Remove the last digit
    }

    // Output the result
    printf("The sum of the digits is: %d\n", sum);

    return 0;
}
