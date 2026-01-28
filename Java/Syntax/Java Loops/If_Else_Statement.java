import java.util.Scanner;
public class If_Else_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("You are a Senior Citizen.");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        }
        else if (18>age && age>13) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are a Kid.");
        }
        input.close();
        }
    }
