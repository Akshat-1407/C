import java.util.*;

public class file {
    public static void main(String[] args) {
        // Creating array
        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the "); System.out.print(i+1); System.out.print(" number: ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Sum
        System.out.print("The sum of all the numbers is: " + sumArr(arr));
    }

    public static int sumArr(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
