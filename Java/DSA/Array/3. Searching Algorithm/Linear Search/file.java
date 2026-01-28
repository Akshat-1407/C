import java.util.Scanner;

public class file {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
       
        int numbers[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Input Array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input Key
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        scanner.close();

        // Linear Search
        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Key is at index " + index);
        }

    }

}
