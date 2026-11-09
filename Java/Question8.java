import java.util.Scanner;

public class Question8 {
    public void solution(int[] list) {
        for(int i = 0; i < list.length; i++) {
            if(list[i] != 0) {
                System.out.print(list[i] + " ");
            }
        }
        for(int i = 0; i < list.length; i++) {
            if(list[i] == 0) {
                System.out.print(list[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Question8 test = new Question8();
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