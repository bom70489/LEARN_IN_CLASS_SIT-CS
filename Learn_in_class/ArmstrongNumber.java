import java.util.Scanner;

public class ArmstrongNumber {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int cons = num;
        int result = 0;
        
        while(num != 0) {
            int mod = num  % 10;
            num = num / 10;
            result += (Math.pow(mod , 3));
        }

        if(result == cons) {
            System.out.print("%d is a arm strong number.".formatted(cons));
        } else {
            System.out.print("%d is not a arm strong number.".formatted(cons));
        }

        
    }
}
