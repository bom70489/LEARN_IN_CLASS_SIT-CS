import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

    static void fibonacci(int num) {
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1); 

        if(num == 1) {
            System.out.print(fibo.get(0) + " ");
            return;
        }

        if(num == 2) {
            System.out.print(fibo.get(0) + " " + fibo.get(1));
            return;
        }

        for(int i = 0; i < num - 2; i++) {
            int first = fibo.get(i);
            int second =  fibo.get(i + 1);
            int result = first + second;
            
            fibo.add(result);
        }

        for(int n : fibo) {
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fibonacci(number);
        sc.close();
    }
}
