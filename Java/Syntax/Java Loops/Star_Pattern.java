import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {

        System.out.println("----- STAR PATTERN NO-1 -----");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        int i = 0;
        while ( i < rows+1 ) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
