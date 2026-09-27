import java.util.Scanner;

class Mountain {
    public void mountain_pattern(int[] num) {
        // find highest
        int highest = 0;
        for(int i = 0; i < num.length; i++) {
            if(highest <= num[i]) {
                highest = num[i];
            }
        }
        // find the pattern
        for(int i = 0; i < highest; i++) {
            for(int j = 0; j < num.length; j++) {
                int space = highest - num[j];
                int current_row = i - space;

                if(current_row >= 0) {
                    int sideSpace = num[j] - 1 - current_row;
                    int stars = 2 * current_row + 1;
                    
                    System.out.print("-".repeat(sideSpace));
                    System.out.print("*".repeat(stars));
                    System.out.print("-".repeat(sideSpace));
                } else {
                    System.out.print("-".repeat(2 * num[j] - 1));
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}

public class Pattern_Mountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mountain mountain = new Mountain();
        int loop = sc.nextInt();
        int[] arrays = new int[loop];

        for (int i = 0; i < loop; i++) {
            arrays[i] = sc.nextInt();
        }

        mountain.mountain_pattern(arrays);

        sc.close();
    }
}