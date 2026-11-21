import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        sc.close();

        for(int i = 1; i <= column; i++) {
            for(int j = 1; j <= row; j++) {
                if(i == 1 || i == column) {
                    System.out.print("*");
                } else {
                    System.out.print("*" + "_".repeat(row - 2) + "*");
                    break;
                }
            }
            System.out.println();
        }
    }
}
