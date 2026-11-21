import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            long num1 = sc.nextLong();
            char oparator = sc.next().charAt(0);
            long num2 = sc.nextLong();
          
            switch (oparator) {
                case '+' :
                    System.out.println(num1 + num2);
                      break;
                  case '-' :
                    System.out.println(num1 - num2);
                    break;
                case '*' :
                    System.out.println(num1 * num2);
                      break;
                case '/' :
                    System.out.println(num1 / num2);
                      break; 
                case '%' :
                    System.out.println(num1 % num2);
                      break;
            }         
            
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            sc.close();
        }

    }
}