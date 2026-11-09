import java.util.Scanner;
public class Question1 {

    public int solution(int[] list , int target) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question1 test = new Question1();
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
