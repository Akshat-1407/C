import java.util.*;

public class reverse_Array {

    public static void reverseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length-1;

        while (start < end) {
            int temp;
            temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start ++ ;
            end -- ;
        } 

    }
    
    public static void main(String[] args) {
       
        int numbers[] = new int[6];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Array Reversal
        reverseArray(numbers);

        // Printing Reversed Array
        System.out.println("The reversed array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        
    }

}