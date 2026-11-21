import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int m_num = (num1 > num2) ? num1 : num2;
        int s_num = (num1 > num2) ? num2 : num1;
        int n = 0;

        for(int j = 1; j <= m_num - s_num + 1; j++) {
            for(int i = m_num; i >= m_num - n; i--) {
                if(i == m_num - n) {
                    System.out.print(i + " ");
                    n++;
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        
        
        sc.close();
    }
}