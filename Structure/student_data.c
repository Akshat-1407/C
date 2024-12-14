// WAP to keep records of a class of 50 students. For each student, we need to read a name of upto 20 characters,
// roll number and marks in 3 subjects. Display the complete database and total marks of 50 students.

#include <stdio.h>

struct student {
    char name[20];
    int roll_no;
    float sub_1, sub_2, sub_3;
};

int main(void) {

    struct student students[50];

    // entering data
    for (int i = 0; i < 50; i++) {
        printf("Enter the name of student %d: ", i+1);
        scanf("%s", &students[i].name);
        printf("Enter the roll number of student %d: ", i+1);
        scanf("%d", &students[i].roll_no);
        printf("Enter the marks of student %d in three subjects: ", i+1);
        scanf("%f %f %f", &students[i].sub_1, &students[i].sub_2, &students[i].sub_3);
    }
    // displaying data
    for (int i = 0; i < 50; i++) {
        printf("\nThe name of student %d is: ", i+1);
        printf("%s", students[i].name);
        printf("\nRoll number of student %d is: ", i+1);
        printf("%d", students[i].roll_no);
        printf("\nThe marks of student %d in three subjects: ", i+1);
        printf("%f %f %f", students[i].sub_1, students[i].sub_2, students[i].sub_3);

        // total marks of each student
        float total_marks = 0;
        total_marks += students[i].sub_1 + students[i].sub_2 + students[i].sub_3;
        printf("\nThe total marks of student %d is: %f", i+1, total_marks);
    }

    return 0;
}

