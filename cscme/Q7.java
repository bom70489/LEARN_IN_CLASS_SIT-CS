import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= num; i++) {
            int next = a + b;
            System.out.print(a + " ");
            a = b;
            b = next;
        }

        sc.close();

    }
}