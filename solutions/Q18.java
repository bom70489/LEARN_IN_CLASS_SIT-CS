import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bacteria = sc.nextInt();
        System.out.println(Integer.bitCount(bacteria));
        sc.close();
    }
}