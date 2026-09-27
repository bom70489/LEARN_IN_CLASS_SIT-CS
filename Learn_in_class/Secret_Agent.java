import java.util.Scanner;

public class Secret_Agent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        sc.close();
        StringBuilder result = new StringBuilder();

        for(int i = words.length() - 1; i >= 0; i--) {
            result.append(words.charAt(i));
        }

        System.out.println(result);

    }
}