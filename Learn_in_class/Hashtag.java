import java.util.Scanner;

public class Hashtag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some word : ");
        String line = sc.nextLine();

        String[] words = line.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String word : words) {
            String formatted = word.substring(0 , 1).toUpperCase() + word.substring(1);

            result.append(formatted);
        }

        String results = result.toString().trim();
        System.out.println("#" + results);
        
        sc.close();
    }
}