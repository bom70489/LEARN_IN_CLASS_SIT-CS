import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPeople = sc.nextInt();
        int targetRevenue = sc.nextInt();
        int result = 0;
        int count = 0;
        sc.close();        
        for(int i = 1; i <= numPeople; i++) {
            if(i % 3 == 0 && i % 7 == 0) {
                result -= 20;
            } else if (i % 3 == 0) {
                result += 65;
            } else if (i % 7 == 0) {
                result += 80;
            } else {
                result += 50;
            }
            count++;
            if(result >= targetRevenue) {
                System.out.println("Total Tickets Sold : " + count);
                System.out.println("Total Revenue : " + result);
                return;
            }
        }
    }
}
