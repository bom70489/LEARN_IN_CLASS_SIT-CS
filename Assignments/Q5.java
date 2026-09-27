import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(i == 0) {
                    System.out.print("V ");
                } else if(j == 0 || j == column - 1) {
                    System.out.print("A ");
                } else if(i == j) {
                    System.out.print("L ");
                } else {
                    System.out.print("N ");
                }
            } 
            System.out.println();
        }

        sc.close();
    }   
}
