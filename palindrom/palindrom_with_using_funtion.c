#include <stdio.h>
#include <string.h>
int main()
{
    char name[100], copy[100], d;
    printf("Enter the Name:");
    gets(name);
    strcpy(copy, name);
    strrev(name);
    d = strcmp(name, copy);
    if (d == 0)
    {
        printf("name is palindrom");
    }
    else
    {
        printf("name is not palindrom");
    }
    return 0;
}