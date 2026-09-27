import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int constant =  number;
        if(number < 0) {
            number = Math.abs(number);
        }
        String result = "";
        
        do {
            result += number % 10;
            number = number / 10;
        }  while (number != 0);
        
        
        if(Integer.valueOf(result) == constant) {
            if(constant < 0) {
                System.out.println(result + "-" + " is a palindrome.");
            } else {
                System.out.println(result  + " is a palindrome.");
            }
        } else  {
            if(constant <  0) {
                System.out.println(result + "-" + " is not a palindrome.");
            }  else {
                System.out.println(result + " is not a palindrome.");
            }
        } 

        sc.close();
    }
}