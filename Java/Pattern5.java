import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("-".repeat(num - 1) + "*".repeat(num));

        for(int i = 1; i <= num - 2; i++) {
            System.out.println("-".repeat(num - i - 1) + "*" + "-".repeat(num - 2) + "*" + "-".repeat(i - 1) + "*");
        }

        System.out.println("*".repeat(num) + "-".repeat(num- 2) + "*");

        for(int i = 1; i <= num - 2; i++) {
            System.out.println("*" + "-".repeat(num - 2) + "*" + "-".repeat(num - i - 2) + "*");
        }

        System.out.println("*".repeat(num));

        sc.close();
    }
} 
