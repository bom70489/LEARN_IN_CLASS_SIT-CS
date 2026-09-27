import java.util.Scanner;

public class Q4_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minute = sc.nextInt();
        String time = sc.next();
        int Start_hours = 12;

        if(time.equalsIgnoreCase("am")) {
            if(hours % 12 == 0) hours = 0;            
        } else if (time.equalsIgnoreCase("pm")) {
            if (hours % 12 == 0) hours = 12;
            else {
                int mod = hours % 12 ;
                hours = Start_hours + mod;
            }
        }

        System.out.printf("%02d:%02d" , hours , minute);

        sc.close();
       
    }
}
