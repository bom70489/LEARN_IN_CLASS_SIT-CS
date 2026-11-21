import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        sc.close();

        if((a >= b && a <= c) || (a >= c && a <=b)) {
            System.out.println(a);
        } else if((b >= a && b <=c) || (b >= c && b <= a)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
