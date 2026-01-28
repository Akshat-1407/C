#include <stdio.h>

int main(void) {
    char str[100];
    char temp[100];
    int length = 0, i, flag = 0;

    printf("Enter a String: ");
    gets(str);

    // strlen - includes null char in the length
    for (i=0; str[i] != '\0'; i++) {
        length++;
    }

    // strrev
    for (i=0; str[i] != '\0'; i++) {
        temp[i] = str[length-1];
        length--;
    }
    temp[i] = '\0';

    // strcmp
    for (i=0; str[i] != '\0'; i++) {
        if (temp[i] == str[i]) {
            flag = 1;
        }
        else {
            break;
        }
    }
    if (flag == 1) {
        printf("Palendrome\n");
    }
    else {
        printf("Not Palendrome\n");
    }

    return 0;
}