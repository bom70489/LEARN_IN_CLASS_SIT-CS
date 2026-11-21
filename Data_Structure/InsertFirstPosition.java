import java.util.Scanner;
import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(0, 10);

        System.out.println(numbers);
        sc.close();
    }
}
