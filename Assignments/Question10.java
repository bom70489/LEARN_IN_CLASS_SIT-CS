import java.util.Scanner;

public class Question10 {
    public void solution(int[] list , int nums , int target) {
        for(int i = 0; i < list.length; i++) {
            int insert = i + 1;
            if(insert == target) {
                System.out.print(nums + " ");
            }
            System.out.print(list[i] + " ");
        }
        if (target == list.length + 1) {
            System.out.print(nums + " ");
        }
    }
    
    public static void main(String[] args) {
        Question10 test = new Question10();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int save[] = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        int nums = sc.nextInt();
        int target = sc.nextInt();
        test.solution(save , nums , target);
        sc.close();
    }
}