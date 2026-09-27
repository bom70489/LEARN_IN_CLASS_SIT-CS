import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine();
        int totalMass = 0;
        for(int i = 0; i < formula.length();) {
            char atom = formula.charAt(i);
            int mess;
            if(atom == 'H') {
                mess = 1;
            } else if(atom == 'C') {
                mess = 12;
            } else if(atom == 'O') {
                mess = 16;
            } else {
                System.out.println("Error");
                return;
            }
            i++;
            int count = 0;
            while(i < formula.length() && Character.isDigit(formula.charAt(i))) {
                count = count * 10 + (formula.charAt(i) - '0'); 
                i++;
            }
            if(count == 0) {
                count = 1;
            }
            totalMass = totalMass + (count * mess);
            sc.close(); 
        }
            System.out.println(totalMass);
    }
}
