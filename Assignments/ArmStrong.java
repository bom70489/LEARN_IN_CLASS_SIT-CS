import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        String check = Integer.toString(num);
        int pow = 0;

        for(int i = 0; i < check.length(); i++) {
            pow++;    
        }

        while(num > 0) {
            int keep = 0;
            keep = num % 10;
            num = num / 10;
            result += Math.pow(keep, pow);
        }

        if(temp == result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
