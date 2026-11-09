import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character , Integer> apple = new HashMap<Character , Integer>();

        while(true) {
            String input = sc.next();
            if(input.equals("0")) {
                break;
            }

            char person = input.charAt(0); 
            int amount = sc.nextInt();
            int oldAmount = apple.getOrDefault(person , 0);
            apple.put(person, oldAmount + amount);
            sc.close();
        }

        char personCheck = sc.next().charAt(0);

        int anwerapples = apple.getOrDefault(personCheck, 0);

        System.out.println(anwerapples);
    }
}
