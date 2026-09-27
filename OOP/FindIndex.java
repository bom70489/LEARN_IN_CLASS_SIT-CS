import java.util.Scanner;

public class FindIndex {
    public void findindex(String words , char target) {
        int count = 0;
        int[] index = new int[words.length()];
        for(int i = 0; i < words.length(); i++) {
            if(target == words.charAt(i)) {
                index[count] = i;
                count++;
            }
        }

        if(count == 0) {
            System.out.println("ERROR");
            return;
        }
        
        System.out.println(count);
        for (int j = 0; j < count; j++) {
            System.out.print(index[j] + (j < count - 1 ? ", " : ""));
        }   
    }

    public static void main(String[] args) {
        FindIndex check = new FindIndex();
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine().toLowerCase();
        char target = sc.next().charAt(0);
        check.findindex(words , target);
        sc.close();
    }
}