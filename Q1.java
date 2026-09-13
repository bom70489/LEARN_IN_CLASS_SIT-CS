import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count = 2;

        if(num > 2) {
            while(num != 1) {
                int result = num / count;
                if(num % count == 0) {
                    System.out.print(count + (result == 1 ? "" : " * "));
                    num = num / count;
                } else {
                    count++;
                }
            }
        } else {
            System.out.print(num);
        }


        sc.close();
    }
}