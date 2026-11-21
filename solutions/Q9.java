import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int train_cart = sc.nextInt();
        sc.nextLine();
        int cart_bom = sc.nextInt();
        sc.close();

        if(cart_bom > train_cart) {
            System.out.println("Why you bomb is go over the train bro. TT");
        } else {
            for(int i = 1; i <= train_cart; i++) {
                if(i == cart_bom || i == cart_bom + 1 || i == cart_bom - 1) {
                   if(train_cart == 3 && cart_bom != 1 && train_cart != cart_bom || train_cart == 2) {
                        System.out.print("DIE");
                        break;
                   }
                   System.out.print(""); 
                } else {
                     System.out.print(i + " ");
                }
            }
        }

    }
}
