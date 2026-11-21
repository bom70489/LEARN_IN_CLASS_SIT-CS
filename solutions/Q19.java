import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quries = sc.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= quries; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            // คำนวณ (a^b) % c โดยไม่ใช้ Math.pow
            long ans = 1;
            a = a % c;
            
            while (b > 0) {
                if (b % 2 == 1) {
                    ans = (ans * a) % c;
                }
                a = (a * a) % c;
                b /= 2;
            }
            
            result.append(ans).append("\n");   
        }

        System.out.print(result);
 
        sc.close();
    }
}