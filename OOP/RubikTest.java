import java.util.Scanner;

public class RubikTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rubik test = new Rubik();
        int time = sc.nextInt();

        for(int i = 0; i < time; i++) {
            String rotation = sc.next();
            int count = sc.nextInt();
            test.rotation(rotation, count);
        }

        test.result();

        sc.close();
    }
}
