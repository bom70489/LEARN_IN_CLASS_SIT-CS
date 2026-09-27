import java.util.Arrays;
import java.util.Scanner;

public class Q1_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        sc.close();
        String reword = word.replace(" " , "");

        char[] convert = reword.toCharArray();
        Arrays.sort(convert);
        
        String result = String.valueOf(convert);
        System.out.println(result);
    }
}
