import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("-" + "*".repeat(number - 2) + "-");

        for(int i = 1; i <= number - 2; i++) {
            System.out.println("*".repeat(number));
        }

        System.out.println("-" + "*".repeat(number - 2) + "-");

        sc.close();
    }
}
