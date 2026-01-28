// Kadane's Algorithm

import java.util.*;

public class kadane_algorithm {
    // It has time complexity of O(n)
    
    public static void maxSubarraySumKadanes(int numbers[]) { // O(n)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum Subarray sum is: " + maxSum);
    }
    
    public static void main(String[] args) {
       
        int numbers[] = new int[4];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        maxSubarraySumKadanes(numbers);
        
    }
}
