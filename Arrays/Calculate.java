import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] numbers = new int[row][column]; 
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < row; i++) {
            int result = 0;
            for(int j = 0; j < column; j++) {
                result += numbers[i][j];
            }
            System.out.println("sum of row#" + i + " " + "is " + result);
        }
        
        sc.close();
        
    }
}