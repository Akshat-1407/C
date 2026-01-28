// Write a program to print area of rectangle using function & return its value to main function.

#include <stdio.h>

float area_of_rect(float l, float b);

void main() {

    float l, b;
    
    printf("Enter the length of the rectangle: ");
    scanf("%f", &l);
    printf("Enter the breadth of the rectangle: ");
    scanf("%f", &b);

    float area = area_of_rect(l, b);

    printf("The area of the rectangle is %.2f\n", area);
}

float area_of_rect(float l, float b) {
    float area = l*b;
    return area;
}
