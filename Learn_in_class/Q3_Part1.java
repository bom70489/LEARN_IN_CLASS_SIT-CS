import java.util.Scanner;

public class Q3_Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = 0;
        for(int i = 1; i <= count; i++) {
            String number = sc.next();
            String cons = number;
            String rev = new StringBuilder(number).reverse().toString();
            if(rev.equals(cons)) {
                num++;
            }
        }

        System.out.print(num);

        sc.close();
    }
}
