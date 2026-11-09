import java.util.Scanner;

public class Question4 {
    public String solution(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] > list[i + 1]) {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Question4 test = new Question4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int save[] = new int[num];
        for(int i = 0; i < num; i++) {
            save[i] = sc.nextInt();
        }
        System.out.println(test.solution(save));
        sc.close();
    }
}
