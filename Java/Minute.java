import java.util.Scanner;

public class Minute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long day = num / 1440;
        long year = day / 365;
        long day_remain = day % 365;

        System.out.println(year + " " + day_remain);
 
        sc.close();
    }
}
