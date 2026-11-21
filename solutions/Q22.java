import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine().toLowerCase();

        int count = 0;
        int keep = 0;

        for(int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                int result = ch - 'a' + 1;
                keep += result - count;
                    count++;
            } else {
                count++;
            }
        }
        
        System.out.println(keep);

        sc.close();
    }   
}
