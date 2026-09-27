import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for(int i = 1; i <= star; i++) {

            for(int space = star; space > i; space--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
