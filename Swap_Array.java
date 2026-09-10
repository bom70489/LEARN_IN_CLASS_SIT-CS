import java.util.Scanner;

public class Swap_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // input value
        int number[] = new int[num];
        for(int i = 0; i < num; i++) {
            number[i] = sc.nextInt();
        }   
        
        int reverse = sc.nextInt();
        for(int j = 0; j < reverse; j++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            // temp to keep number;
            int temp = number[num1];
            number[num1] = number[num2];
            number[num2] = temp;
        
        }

        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        sc.close();
    }   
}