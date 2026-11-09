import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int number1 = sc.nextInt();
        for(int i = 0; i < number1; i++) {
            nums.add(sc.nextInt());
        }
        int number2 = sc.nextInt();
        for(int i = 0; i < number2; i++) {
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);
        int size = nums.size();
        double median = 0;
        sc.close();
        for(int i = 0; i < size; i++) {
            if(size == 0) {
                return;
            } else if (size % 2 == 1) {
                median = nums.get(size / 2);
            } else {
                median = (nums.get(size / 2 - 1) + nums.get(size / 2)) / 2.0;
            }
        }
        
        System.out.printf("The median of the two sorted arrays is: %.1f" , median);
        
    }
}