// Write a c program to copy & count the character content of one file says a.txt to another file b.txt

#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *sourceFile, *destFile;
    char sourceFilename[] = "a.txt";
    char destFilename[] = "b.txt";
    char ch;
    int charCount = 0;

    // Open the source file in read mode
    sourceFile = fopen(sourceFilename, "r");
    if (sourceFile == NULL) {
        printf("Error: Could not open file %s for reading.\n", sourceFilename);
        return 1;
    }

    // Open the destination file in write mode
    destFile = fopen(destFilename, "w");
    if (destFile == NULL) {
        printf("Error: Could not open file %s for writing.\n", destFilename);
        fclose(sourceFile); // Close the source file before exiting
        return 1;
    }

    // Copy content from source to destination and count characters
    while ((ch = fgetc(sourceFile)) != EOF) {
        fputc(ch, destFile); // Write character to the destination file
        charCount++;         // Increment character count
    }

    // Close both files
    fclose(sourceFile);
    fclose(destFile);

    // Output the character count
    printf("File copied successfully.\n");
    printf("Number of characters copied: %d\n", charCount);

    return 0;
}
