import java.util.Scanner;

public class Question9 {
    public void solution(int[] list) {
        int one = 0;
        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] > one) {
                one = list[i];
            }
        }
        int second = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] != one && list[i] > second) {
                second = list[i];
            }
        }
        System.out.println(second);      
    }
    
    public static void main(String[] args) {
        Question9 test = new Question9();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int save[] = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        test.solution(save);
        sc.close();
    }
}