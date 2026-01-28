import java.util.Scanner;
public class Switch_Case_Statements {
    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values.
        // A switch works with the byte, short, char, and the int primitive data types.
        // it also works with the enumerated types(enum types), the string class and a few special classes that wrap certain primitive data types: Character, Byte, Short and Integer(Discussed in Number and string.)
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = input.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "Thursday":
                System.out.println("It's Thursday!");
                break;
            case "Friday":
                System.out.println("It's Friday!");
                break;
            case "Saturday":
                System.out.println("It's Saturday!");
                break;
            case "Sunday":
                System.out.println("It's Sunday!");
                break;
        
            default:  // if none of the cases match then the default will run
                System.out.println(day+" is not a day!");
                break;
        }
        input.close();
    }

}