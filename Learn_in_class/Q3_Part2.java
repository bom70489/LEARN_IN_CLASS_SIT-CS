import java.util.Scanner;

public class Q3_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        sc.close();

        // StringBuilder for reverse word  and result.
        StringBuilder rever = new StringBuilder(word2).reverse();
        StringBuilder result = new StringBuilder();

        // check length 
        int leng = (word1.length() > word2.length()) ? word1.length() : word2.length();

        for(int i = 0; i < leng; i++) {
            if(i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                result.append(rever.charAt(i));
            }
        }

        System.out.println(result);

    }
}