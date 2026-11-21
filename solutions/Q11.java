import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // top
        System.out.println("_".repeat(n - 1) + "*".repeat(n));

        // loop 1
        for(int i = 1; i <= n - 2; i++) {
            System.out.println("_".repeat(n - i - 1) + "*" + "_".repeat(n - 2) + "*" + "_".repeat(i - 1) + "*");
        }

        // middle
        System.out.println("*".repeat(n) + "_".repeat(n - 2) + "*");

        // loop 2
        for(int i = 1; i <= n - 2; i++) {
            System.out.println("*" + "_".repeat(n - 2) + "*" + "_".repeat(n - 2 - i) + "*");
        }
       
        // bottom
        System.out.println("*".repeat(n));

    }
}
