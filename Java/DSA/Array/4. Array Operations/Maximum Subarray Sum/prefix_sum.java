// A prefix sum array, also known as a cumulative sum array, is a data structure derived from an original array. 
// Each element in the prefix sum array stores the sum of all elements from the beginning of the original array
// up to the corresponding index. 


import java.util.*;

public class prefix_sum {

    // It has time complexity of O(n^2)
    
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Calculating prefix array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        // finding the start of the subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // finding the end of the subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // Finding current sum using prefix array
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                maxSum = Math.max(currSum, maxSum);               
            }
        }
        System.out.println("The Maximum sum is: " + maxSum);
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

        maxSubarraySum(numbers);
        
    }
}