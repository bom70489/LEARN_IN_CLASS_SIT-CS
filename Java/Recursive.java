import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long result = factorial(num);
        if(num >= 0) {
            System.out.print(result);
        } else {
            System.out.print("Invalid Number!");
        }
        sc.close();
    }

    public static long factorial(long number) {
        if(number == 0) {
            return 1;
        } else if (number > 0) {
            return number * factorial(number - 1);
        } else {
            return 0;
        }
    }
}
