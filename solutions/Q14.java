import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minute = sc.nextInt();

        int year = minute / 525600; 
        int year_mod = minute % 525600;
        int days = year_mod / 1440;
        

        System.out.println(year + " " + days);

        sc.close();
    }
}
