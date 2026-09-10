public class RaggedArrayDemo {
    public static void main(String[] args) {
        // A ragged array: rows have different numbers of columns
        int[][] ragged = {
            {1, 2, 3},    // Row 0 has 3 columns
            {4, 5},       // Row 1 has 2 columns
            {6, 7, 8, 9}  // Row 2 has 4 columns
        
        };

        System.out.println("Printing the Ragged Array:");
        // Iterating through the ragged array
        for (int i = 0; i < ragged.length; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
