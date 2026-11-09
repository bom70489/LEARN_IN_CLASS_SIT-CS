import java.util.Scanner;
public class Question3 {

    public void solution(int[] list) {
        for(int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {
        Question3 test = new Question3();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] save = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt(); 
        }
        test.solution(save);
        sc.close();
    }
} 
