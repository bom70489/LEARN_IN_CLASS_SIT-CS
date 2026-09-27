import java.util.Scanner;

public class Q2_Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        if(word.contains("cat") && word.contains("dog")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
