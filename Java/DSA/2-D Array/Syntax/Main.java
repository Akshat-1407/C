import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        int arr[][] = new int[m][n];

        inputArray(arr, n, m);
        outputArray(arr, n, m);
        findElement(arr, n, m, 5);

        scanner.close();
    }

    public static void inputArray(int arr[][], int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element of the matrix: ");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void outputArray(int arr[][], int n, int m) {
        System.out.println("The elements entered are: ");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findElement(int arr[][], int n, int m, int key) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == key) {
                    System.out.println("The element is found at (" +i+ ", " +j+ ") index" );
                }
            }
        }
    }
}


