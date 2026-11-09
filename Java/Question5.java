import java.util.Scanner;

public class Question5 {
    public void solution(int[] list1 , int[] list2) {
        for(int i = 0; i < list1.length; i++) {
            int result = list1[i] + list2[i];
            System.out.print(result + " ");
        }
    }
    
    public static void main(String[] args) {
        Question5 test = new Question5();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int save[] = new int[num];
        int save2[] = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++) {
            save2[i] = sc.nextInt();
        }
        test.solution(save , save2);
        sc.close();
    }
}
