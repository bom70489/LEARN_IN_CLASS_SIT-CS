import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1) {
            isPrime = false;
        }

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }   

        System.out.println(isPrime);

        sc.close();
    }   
}
