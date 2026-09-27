public class MultiArrayDemo {
    public static void main(String[] args) {
        // A 2D array: 3 rows, 2 columns
        int[][] matrix = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        // Iterating through the 2D array
        System.out.println("Printing the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
