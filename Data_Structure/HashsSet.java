import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class HashsSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        HashSet<Character> words = new HashSet<Character>();

        for(int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            letter = Character.toUpperCase(letter);
            words.add(letter);
        }

        ArrayList<Character> sorts = new ArrayList<Character>();
        sorts.addAll(words);
        Collections.sort(sorts);

        for(int i = 0; i < sorts.size(); i++) {
            System.out.print(sorts.get(i) + " ");
        }
        
        sc.close();
    }
}
