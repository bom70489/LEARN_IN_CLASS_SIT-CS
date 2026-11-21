import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        
        if(word1.length() > word2.length()) {
            System.out.println(word1.replace(word2, ""));
        } else {
            System.out.println(word2.replace(word1, ""));
        }

        
        sc.close();
    }
}
