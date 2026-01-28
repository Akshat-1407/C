import java.util.Scanner;

public class largestInArray {

    public static int getLargest(int numbers[]) {
         
        int largest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // or largest = Integer.MIN_VALUE;  sets the value to lowest possible integer value.
            }
        }

        return largest;
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

        int largest = getLargest(numbers);

        System.out.println("The largest number in the given array is: " + largest);
        
    }

}

