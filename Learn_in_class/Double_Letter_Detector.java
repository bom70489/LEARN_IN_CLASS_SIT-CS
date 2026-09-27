import java.util.Scanner;

public class Double_Letter_Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int count = 0;
        sc.close();

        for(int i = 0; i < words.length() - 1; i++) {
            if(words.charAt(i) == words.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
