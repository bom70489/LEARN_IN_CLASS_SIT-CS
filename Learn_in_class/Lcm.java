import java.util.Arrays;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int[] results_a = {};
        int[] results_b = {};
        int max_num = (a > b) ? a : b;
        int[] end = {};
        
        for(int i = 1; i <= max_num; i ++) {
            int result_a = a * i;
            results_a = Arrays.copyOf(results_a, results_a.length + 1);
            results_a[results_a.length - 1] = result_a;

            int result_b = b * i;
            results_b = Arrays.copyOf(results_b, results_b.length + 1);
            results_b[results_b.length - 1] = result_b;    
        }

        for(int data_a : results_a) {
            for(int data_b : results_b) {
                if(data_a == data_b) {
                    end = Arrays.copyOf(end , end.length + 1);
                    end[end.length - 1] = data_a;                    
                }
            }
        }

        int min = end[0];
        for(int i = 1; i < end.length; i++) {
            if(end[i] < min) {
                min = end[i];
            }
        }

        System.out.println(min);
        sc.close();
    }
}
