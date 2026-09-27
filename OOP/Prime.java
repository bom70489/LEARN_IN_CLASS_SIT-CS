import java.util.Scanner;

public class Prime {
    public void prime(int number) {
        boolean check = number > 1;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                check = false;
                break;
            }
        }
        
        if(check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Prime check = new Prime();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        check.prime(number);
        sc.close();
    }
}