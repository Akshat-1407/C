#include <stdio.h>
#include <string.h>

int main(void) {
    char str[100];
    char temp[100];

    printf("Enter a String: ");
    gets(str);

    strcpy(temp, str);

    strrev(str);
    
    if (strcmp(temp, str) == 0) {
        printf("Palendrome\n");
    }
    else {
        printf("Not Palendrome\n");
    }

    return 0;
}