#include <stdio.h>

int main(void) {
    char s[100];
    int l = 0, i, flag = 1;

    printf("Enter a String: ");
    gets(s);

    // calcule the length of the string.
    // length includes null character
    for (i=0; s[i] != '\0'; i++) {
        l++;
    }

    // to check palendrome
    for (i = 0; i < l/2; i++) {
        if (s[i] != s[l-i-1]) {
            flag = 0;
            break;
        }
    }

    if (flag == 0) {
        printf("Not Palendrome\n");
    }
    else {
        printf("Palendrome\n");
    }

    return 0;
}