import java.util.Scanner;

public class EveryN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int devide = sc.nextInt();
        int leng = input.length();

        for(int i = 0; i < leng; i++) {
            if(i % devide == 0) {
                System.out.print(input.charAt(i));
            }
        }

        sc.close();
    }   
}
