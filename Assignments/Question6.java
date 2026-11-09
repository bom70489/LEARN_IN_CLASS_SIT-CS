import java.util.Scanner;

public class Question6 {
    public int solution(int[] list1 , int target) {
        for(int i = list1.length - 1; i >= 0; i--) {
            if(list1[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Question6 test = new Question6();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int save[] = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(test.solution(save , target));
        sc.close();
    }
}