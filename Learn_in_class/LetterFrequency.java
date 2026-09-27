import java.util.Scanner;

public class LetterFrequency {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = sc.nextLine();
        System.out.print("Enter the target :");
        String targets = sc.nextLine();
        boolean isFirst = true;
        String pr = "";

        for(char target : targets.toCharArray()) {
            int index = 0;
            for(char c : word.toCharArray()) {
                if(c == target) {
                    index++;
                }
            }

            if(index > 0) {
                if(!isFirst) {
                    pr += ", ";
                }
            }

            pr += target + ": " + index;
            isFirst = false;
        }

        System.out.println(pr);


        sc.close();
    }
}