import java.util.Scanner;

class Q35 {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int first = (number1 <= number2) ? number1 : number2;
        int second = (number1 >= number2) ? number1 : number2;
        int sum = 0;
        
        // 2 3 5 = 10;
        for(int i = first; i < second; i++) {
            boolean isPrime = true;
            // System.out.println("hi");

            for(int j = 2; j < i; j++) {
                // System.out.println(isPrime + " " + j);
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sum += i;
            }
        }

        System.out.println(sum);

        sc.close();
  }
}
