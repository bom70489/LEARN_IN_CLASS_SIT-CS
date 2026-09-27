import java.util.Scanner;

public class X_cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();        
        sc.close();
        if(word.length() % 2 == 0) {
            System.out.print("Invalid word input");
            return;
        } else {
            int n = word.length();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == j || i + j == n - 1) {
                        System.out.print(word.charAt(j));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}