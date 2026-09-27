import java.util.Arrays;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first numuber : ");
        int a = sc.nextInt();
        System.out.print("Enter second numuber : ");
        int b = sc.nextInt();

        int small_num = (a > b) ? b : a;
        int[] nums_a = {};
        int[] nums_b = {};
        int result = 0;

        for(int i =  1; i <= small_num; i++) {
            if (a % i  == 0) {
                nums_a = Arrays.copyOf(nums_a, nums_a.length + 1);
                nums_a[nums_a.length - 1] = i;
                // System.out.println(i);
            }

            if(b % i == 0) {
                nums_b = Arrays.copyOf(nums_b, nums_b.length + 1);
                nums_b[nums_b.length - 1] = i;
                // System.out.println(i);
            }
        }


        for(int result_a : nums_a) {
            for(int result_b : nums_b) {
                if(result_a == result_b) {
                    result = result_a;
                    break;
                }
            }
        }

        System.out.print(Integer.valueOf(result));

        sc.close();
        
    }
}
