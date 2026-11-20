import java.util.Scanner;
import java.util.HashSet;

public class Sentence_Reviews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashSet<Character> checked = new HashSet<>();
        int leng = input.length();

        sc.close();

        for(int i = 0; i < leng; i++) {
            checked.add(input.charAt(i));
        }

        long sum = 0;
        for(char ch : checked) {
            if(Character.isLetter(ch)) {
                int num = ch;
                sum += num;
            }
        }

        long cal = (sum * sum) % leng;

        if(cal >= 0 && cal <= 10) {
            System.out.println(cal + "/10");
        } else {
            System.out.println("ERROR");
        }
        
    }
}