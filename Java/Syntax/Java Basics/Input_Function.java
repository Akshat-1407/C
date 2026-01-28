import java.util.Scanner;

public class Input_Function {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);  // we can now use scan variable to take user scan.

        System.out.print("Enter your name: ");
        String name = input.nextLine();   // we will store the user scan in the variable named name.

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();
        // nextLine() method reads upto the \n which is an escape sequence for when we hit the enter while the nextInt() method do not read /n.
        // when we use nextLine() and hit enter \n remains in the scanner and then when we use nextLine after nextInt(), because of the \n which is previouly there in the scanner, is scanned and the input is stored.
        // to resolve this we use a empty nextLine() to remove the \n from the scanner.

        System.out.print("Enter a food you like: ");
        String food = input.nextLine();
        input.close();

        System.out.println();

        System.out.println("Your name is " + name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You like " + food);
    }
}
