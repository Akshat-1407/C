import java.util.*;

public class file {
    public static void main(String[] args) {
        
        // Creating array
        int numbers[] = new int[15];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the " + i + " element: ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        System.err.println("The numbers are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + ", ");
        }

    }
}