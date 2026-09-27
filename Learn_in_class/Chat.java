import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length(); i++) {
            char originalChar = words.charAt(i);
            char lower = Character.toLowerCase(originalChar);
            if(lower == 'a') {
                result.append("4");
            } else if (lower == 'e') {
                result.append("3");
            } else if (lower == 'i') {
                result.append("1");
            } else if (lower == 'o') {
                result.append("0");
            } else {
                result.append(words.charAt(i));
            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}
   