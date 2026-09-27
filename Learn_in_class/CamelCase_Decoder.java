import java.util.Scanner;

public class CamelCase_Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        sc.close();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if(Character.isUpperCase(ch)) result.append(" ").append(ch);
            else result.append(ch);    
        }

        System.out.println(result);
        
    }
}
