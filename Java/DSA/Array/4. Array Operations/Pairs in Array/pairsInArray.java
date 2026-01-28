import java.util.*;

public class pairsInArray {

    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                totalPairs ++;
            }
            System.out.println();
        }
        System.out.println("Total possible pairs are: " + totalPairs);
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

        // Printing all possible pairs
        printPairs(numbers);
        
    }
}