import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean check = true;
        
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i - 1) > word.charAt(i)) {
                check = false;
            }
        }

        System.out.println(check);

        sc.close();
    }
}