import java.util.Scanner;

public class Soda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fperson = sc.next();
        int total_soda = sc.nextInt();
        String Sperson  = (fperson.equals("A")) ? "B" : "A";
        int drink = 0;
        int n = 9;
        for(int round = 1; round <= n; round++) {
            for(int first = 1; first <= round; first++) {
                drink++;
                if(drink == total_soda) {
                    System.out.print(fperson);
                    break;
                }
            }
            for(int second = 1; second <= round; second++) {
                drink++;
                if(drink == total_soda) {
                    System.out.print(Sperson);
                    break;
                }
            }
        }

        sc.close();
    }   
}
