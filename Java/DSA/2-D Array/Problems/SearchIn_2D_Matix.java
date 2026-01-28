public class SearchIn_2D_Matix {
    public static void main(String[] args) {

        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        boolean result = searchMatrix(matrix, 3);
        System.out.println(result);

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int currRow = 0, currCol = m-1;

        while(currRow < n && currCol >= 0) {
            if(target > matrix[currRow][currCol]) {
                // move down
                currRow++;     
            }
            else if(target < matrix[currRow][currCol]) {
                // move left
                currCol--;
            }
            else {
                return true;
            }
        }
        return false;    
    }
}
