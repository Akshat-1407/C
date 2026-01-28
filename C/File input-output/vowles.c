// WAP in C language to count the total numbers of vowels in a text file.

#include <stdio.h>

int main() {
    
    FILE *fp1;
    char ch;
    int count = 0;

    // Open the source file in read mode
    fp1 = fopen("a.txt", "r");
    if (fp1 == NULL) {
        printf("Error: Could not open file for reading.\n");
        return 1;
    }

    ch = fgetc(fp1);
    while (ch != EOF) {
        char vowles[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i=0; i<10; i++) {
            if(ch == vowles[i]) {
                count++;
            }
        }
        ch = fgetc(fp1);
    }

    printf("The total number of vowels in the file are: %d", count);

    return 0;
}
