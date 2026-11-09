import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> scores = new HashMap<>();

        while(true) {
            String input = sc.next();
            if(input.equalsIgnoreCase("END")) {
                break;
            }

            int number = sc.nextInt();
            int oldscores = scores.getOrDefault(input , 0);
            scores.put(input , number + oldscores);
        }

        ArrayList<String> result = new ArrayList<>(scores.keySet());
        result.sort(null);

        // for(int i = 0; i < result.size(); i++) {
        //     String first = result.get(i);
        //     System.out.println(first + " : " + scores.get(first));
        // }
        
        for(Map.Entry<String , Integer> entry : scores.entrySet()) {
            String first = entry.getKey();
            int second = entry.getValue();
            System.out.println(first + " : " + second);
        }

        sc.close();
    }
}
