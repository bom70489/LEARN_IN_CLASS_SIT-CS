import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            for(int j = 1; j <= i - 1 ; j++) {
                System.out.print("-");
            }

            for(int k = i; k <= num; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
