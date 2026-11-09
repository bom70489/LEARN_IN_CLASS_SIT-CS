import java.util.Scanner;

public class Question7 {
    public String solution(int[] list) {
        for(int i = 0; i < list.length; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[i] == list[j]) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
    
    public static void main(String[] args) {
        Question7 test = new Question7();
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