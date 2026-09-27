import java.util.Scanner;

public class Isbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter 5 degit!\n");
        int[] numbers = new int[5];
        int mulitiple = 1;
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter a %d digit number : " , i + 1);
            numbers[i] = sc.nextInt();
        }

        for (int cal : numbers) {
            mulitiple = (int) Math.pow(cal , 2);
            result += mulitiple;
        }

        System.out.println("Weighted Sum : " + result);
        sc.close();
    }
}
