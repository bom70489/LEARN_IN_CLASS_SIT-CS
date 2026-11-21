import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();

        for(int i = 1; i <= column; i++) {
            for(int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
