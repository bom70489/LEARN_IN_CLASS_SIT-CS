import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Parctice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character , Integer> words = new HashMap<>();
        String input = sc.nextLine().toUpperCase();
        
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isWhitespace(input.charAt(i))) {
                int oldcount = words.getOrDefault(input.charAt(i) , 0);
                words.put(input.charAt(i) , oldcount + 1); 
            }
        }
        
        ArrayList<Character> result = new ArrayList<>(words.keySet());
        result.sort(null);

        for(int i = 0; i < result.size(); i++) {
            char letter = result.get(i);
            System.out.println(letter + " : " + words.get(letter));
        }

        sc.close();
    }
}
