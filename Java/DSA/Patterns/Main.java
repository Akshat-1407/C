public class Main {
    public static void main(String[] args) {

        // hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramid_2(6);
        // inverted_half_pyramid_with_numbers(5);
        // floyds_triangle(5);
        // triange_0_1(5);
        // butterfly_pattern(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(4);
        
    }


    public static void hollow_rectangle(int rows, int cols) {

        // *****
        // *   *
        // *   *
        // *****

        // outer loop - row
        for (int i=1; i<=rows; i++) {
            // inner loop - column
            for (int j=1; j<=cols; j++) {
                //boundary condition - (i, j)
                if (i==1 || i==rows || j==1 || j==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void inverted_rotated_half_pyramid_1(int n) {

        //     *
        //    **
        //   ***
        //  ****
        // *****

        // outer loop - row
        for (int i=1; i<=n; i++) {
            // inner loop - column
            for (int j=1; j<=n; j++) {
                // condition for printing --> If currCol <= total rows - currRow
                if(j<=n-i) {
                    System.err.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }  
    }

    public static void inverted_rotated_half_pyramid_2(int n) {

        //     *
        //    **
        //   ***
        //  ****
        // *****

        // outer loop - row
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }


    public static void inverted_half_pyramid_with_numbers(int n) {

        // 12345
        // 1234
        // 123
        // 12
        // 1

        // outer loop - row
        for (int i=1; i<=n; i++) {
            // inner loop - column
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }  
    }


    public static void floyds_triangle(int n) {

        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        
        int num = 1;
        // outer loop - row
        for (int i=1; i<=n; i++) {
            // inner loop - column
            for (int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }  
    }


    public static void triange_0_1(int n) {

        // 1
        // 01
        // 101
        // 0101
        // 10101
        
        // outer loop - row
        for (int i=1; i<=n; i++) {
            // inner loop - column
            for (int j=1; j<=i; j++) {
                // pattern observed is that if the sum of current row and column is even then print 1 else print 0
                if ((i+j) % 2 == 0) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }  
    }


    public static void butterfly_pattern(int n) {

        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        // first half
        for (int i=1; i<=n; i++) {

            // stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j=1; j<=(2*(n-i)); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  

        // second half
        for (int i=n; i>=1; i--) {

            // stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j=1; j<=(2*(n-i)); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }


    public static void solid_rhombus(int n) {

        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rhombus(int n) {

        //     *****
        //    *   *
        //   *   *
        //  *   *
        // *****

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // printing hollow rectangle
            for (int j=1; j<=n; j++) {
                //boundary condition - (i, j)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


    public static void diamond(int n) {

        //    *
        //   ***
        //  *****
        // *******
        // *******
        //  *****
        //   ***
        //    *

        // part one
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // part two
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }

    

}

