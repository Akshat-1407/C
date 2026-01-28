import java.util.Scanner;

public class file {

    public static int binarySearch(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
       
        int numbers[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter a sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input Key
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        scanner.close();

        // Binary Search
        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Key is at index " + index);
        }

    }

}
