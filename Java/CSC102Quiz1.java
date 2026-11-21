import java.util.Scanner;
import java.util.Arrays;

public class CSC102Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String person1 = sc.nextLine();
        int p1[] = new int[3]; 
        p1[0] = sc.nextInt();
        p1[1] = sc.nextInt();
        p1[2] = sc.nextInt();
        sc.nextLine();

        String person2 = sc.nextLine();
        int p2[] = new int[3]; 
        p2[0] = sc.nextInt();
        p2[1] = sc.nextInt();
        p2[2] = sc.nextInt();
        
        int p1_win = 0;
        int p2_win = 0;

        // max[2] min[0] medium[1]
        Arrays.sort(p1);
        Arrays.sort(p2);

        // compare max
        if(p1[2] > p2[2]) p1_win++;
        else if(p2[2] > p1[2]) p2_win++;

        // compare min
        if(p1[0] > p2[0]) p1_win++;
        else if(p2[0] > p1[0]) p2_win++;
 
        if(p1_win == 2) {
            System.out.printf("Perfect Win (%s)%n" , person1);
        } else if(p2_win == 2) {
            System.out.printf("Perfect Win (%s)%n" , person2);
        } else {
            if(p1[1] > p2[1]) p1_win++;
            else if(p2[1] > p1[1]) p2_win++;

            if(p1_win > p2_win) {
                System.out.printf("Win (%s)%n" , person1);
            } else if(p2_win > p1_win) {
                System.out.printf("Win (%s)%n" , person2);
            } else {
                System.out.println("Draw");
            }
        }

        sc.close();
    }
} 
