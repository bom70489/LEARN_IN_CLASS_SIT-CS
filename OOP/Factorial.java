import java.util.Scanner;

public class Factorial {

    void factorial(int number) {
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Factorial check = new Factorial();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        check.factorial(number);
        sc.close();
    }
}