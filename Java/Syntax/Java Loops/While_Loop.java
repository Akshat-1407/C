import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.err.println("Hello "+name);
        scanner.close();
    }
}

/*

import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank())
        System.err.println("Hello "+name);
        scanner.close();
    }
}

In Do while loop we enters the loop at least one irrespective of whether the condition is true or false.
In while loop we enters the loop only when the condition is true and to exit the loop the condition has to be false.

*/