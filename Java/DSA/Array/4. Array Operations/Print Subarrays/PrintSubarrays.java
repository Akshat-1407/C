import java.util.*;

public class PrintSubarrays {

    public static void printSubarrays(int numbers[]) {
        int totalSubarrays = 0;

        // finding the start of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // finding the end of the subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                // printing the subarray form start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");   
                }
                
                totalSubarrays ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total possible pairs are: " + totalSubarrays);
    }
    
    public static void main(String[] args) {
       
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Printing all possible subarrays
        printSubarrays(numbers);
        
    }
}