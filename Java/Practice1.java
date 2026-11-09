import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> words = new HashSet<>();
        String input = sc.nextLine();
        
        for(int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            letter = Character.toUpperCase(letter);
            words.add(letter);
        }

        ArrayList<Character> result = new ArrayList<>();
        result.addAll(words);
        result.sort(null);

        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

        sc.close();

    }
}
