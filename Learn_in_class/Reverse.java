import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder res = new StringBuilder();

        int len = word.length();
        int half = len / 2;

        if (len % 2 == 0) {
            // 1. First half reversed: from (half - 1) down to 0
            for (int i = half - 1; i >= 0; i--) {
                res.append(word.charAt(i));
            }

            // 2. Second half reversed: from (len - 1) down to half
            for (int i = len - 1; i >= half; i--) {
                res.append(word.charAt(i));
            }
        } else {
            // 1. First half reversed: from (half - 1) down to 0
            for (int i = half - 1; i >= 0; i--) {
                res.append(word.charAt(i));
            }

            // 2. Keep the middle character unchanged
            res.append(word.charAt(half));

            // 3. Second half reversed: from (len - 1) down to (half + 1)
            for (int i = len - 1; i > half; i--) {
                res.append(word.charAt(i));
            }
        }

        System.out.println(res);
        sc.close();
    }
}