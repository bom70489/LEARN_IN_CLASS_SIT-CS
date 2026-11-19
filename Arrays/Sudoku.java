import java.util.Scanner;


public class Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sudoku[][] = new int[9][9];

        for(int i = 0; i < sudoku.length; i++) {
            for(int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < sudoku.length; i++) {
            for(int j = 0; j < sudoku[i].length; j++) {
                int num[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
                if(i == 0) {
                    
                }
            }
        }
        

        for(int i = 0; i < sudoku.length; i++) {
            System.out.println();
            for(int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
        }
        

        sc.close();
    }
}