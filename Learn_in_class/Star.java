import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
  
        for(int i = 1; i <= star; i++) {

            for(int space = star; space > i; space--) {
                System.out.print(" ");
            }

            for(int j = i; j <= (2 * i) - 1; j++) {
                System.out.print(j);
            }

            for(int decrease = (2 * i) - 2; decrease >= i; decrease--) {
                System.out.print(decrease);
            }
      
            System.out.println();
        }
        sc.close();
    }
}