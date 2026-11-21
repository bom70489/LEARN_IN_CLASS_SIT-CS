import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n) {
                   System.out.print("_" + "*".repeat(n - 2) + "_");
                   break;
                }

                System.out.print("*");
                
            }
            System.out.println();
        }

    }
}
