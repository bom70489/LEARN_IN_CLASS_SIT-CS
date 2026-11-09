import java.util.Scanner;
public class Question2 {
    public int solution(int[] list , int target) {
        int count = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question2 test = new Question2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] save = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.print(test.solution(save, target));
        sc.close();
    }    
}
