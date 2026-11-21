import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char target = sc.next().toLowerCase().charAt(0);
        int count = 0;
        String total = "";
        sc.close();

        if(words.indexOf(target) == -1) {
            System.err.println("Error");
            return;
        } else {
            for(int i = 0; i < words.length(); i++) {
    
                if(words.toLowerCase().charAt(i) == target) {
                    total += (count++ > 0 ? ", " : "") + i;         
                } 
            }
        }


        System.out.println(count);
        System.out.println(total);
    }
}