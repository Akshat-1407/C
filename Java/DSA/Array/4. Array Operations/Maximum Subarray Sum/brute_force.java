import java.util.*;

public class brute_force {

    public static void maxSubarraySum(int numbers[]) { // O(n^3)
        int maxSum = Integer.MIN_VALUE;

        // finding the start of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // finding the end of the subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                int currSum = 0;
                // finding sum of subarray
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k]; 
                }
  
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("The Maximum sum is: " + maxSum);
    }
    
    public static void main(String[] args) { // O(n^2)
       
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        maxSubarraySum(numbers);
        betterBruteForceMaxSubarraySum(numbers);
        
    }

    public static void betterBruteForceMaxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        // finding the start of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int currSum = 0;
            // finding the end of the subarray
            for (int j = i; j < numbers.length; j++) {
                currSum = currSum + numbers[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("The Maximum sum is: " + maxSum);
    }
}