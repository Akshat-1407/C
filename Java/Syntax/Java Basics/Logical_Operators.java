import java.util.Scanner;
public class Logical_Operators {
    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //                      
        //                     && = (AND) both conditions must be true.
        //                     || = (OR) enther condition must be true.
        //                     ! = (NOT) reverses boolean value of a condition.

        Scanner input = new Scanner(System.in);

        System.out.print("You are playing a game (Press \'Q\' or \'q\' to quit): ");
        String response = input.nextLine();

        if (response.equals("Q") || response.equals("q")) {
            System.out.println("You quit the game.");
        }
        else {
            System.out.println("You are still playing the game.");
        }
       
        
        System.out.print("You are playing a game (Press \'Q\' or \'q\' to quit): ");
        String answer = input.nextLine();

        if (! answer.equals("Q") && ! answer.equals("q")) {
            System.out.println("You are still playing the game.");
        }
        else {
            System.out.println("You quit the game.");
        }
        input.close();
    }
}