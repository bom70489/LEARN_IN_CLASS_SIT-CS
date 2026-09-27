import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String temp = words;
        StringBuilder rev = new StringBuilder(words).reverse();
        
        if(temp.equals(rev.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}