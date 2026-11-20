import java.util.Scanner;

public class BitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(Integer.bitCount(num));
        sc.close();
    }
}
