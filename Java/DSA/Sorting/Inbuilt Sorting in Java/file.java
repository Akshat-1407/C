import java.util.Arrays;
import java.util.Collections;  

// Collection do not work on primitive data type. 
// They work on wrapper classes (Integer) rather than (int)

public class file {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 6, 2, 7, 3, 5};
        Arrays.sort(arr1);

        Integer arr2[] = {6, 1, 2, 7, 4, 5, 3};
        Arrays.sort(arr2, Collections.reverseOrder());

        printArr(arr1);
        // printArr(arr2);


        
    }
}
