import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long result = 0;
        for(long i = 1; i <= num; i++) {
            result += i;
        } 

        System.out.println(result);


        sc.close();
    }
}
