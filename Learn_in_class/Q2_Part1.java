import java.util.Scanner;

public class Q2_Part1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String word = sc.nextLine();

         String deleteword = word.replace(";", " ");
         System.out.print(deleteword);
         sc.close();
    }
}
