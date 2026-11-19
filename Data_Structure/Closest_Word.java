import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Closest_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String target = sc.nextLine().toLowerCase();
        Map<Character, Integer> checked = new HashMap<>();
        
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            checked.put(c, checked.getOrDefault(c, 0) + 1);
        }

        int n = sc.nextInt();
        int[] count = new int[n];
        ArrayList<String> keep_words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            keep_words.add(word); 
            
            String lowerWord = word.toLowerCase();
            for(int j = 0; j < lowerWord.length(); j++) {
                char c = lowerWord.charAt(j);
                for(Map.Entry<Character , Integer> entry : checked.entrySet()) {
                    if(c == entry.getKey()) {
                        count[i] += entry.getValue();
                    }
                 }
            }
        }

        int maxCount = -1;
        String bestWord = "";
        
        for (int i = 0; i < n; i++) {
            if (count[i] >= maxCount) {
                maxCount = count[i];
                bestWord = keep_words.get(i);
            }
        }

        System.out.println(bestWord);
        sc.close();
    }
}