import java.util.Scanner;

public class RecursiveLogarithm {
	public static int log(int a, int b){
		if(a == 1) {
			return 0;
		}

		int first = 0;
		for(int i = 1; i <= a; i++) {
			if(b * i == a) {
				first = i;
				break;
			}
		}

		// input 16 4
		// log(16 , 4) -> (4 , 4) = 1 
		// log(4 , 4) -> (1 , 4) = 1
		// log(1 , 4) -> a = 1 return 0;
		// mean got 2;
		
		return 1 + log(first , b);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(log(a,b));
		sc.close();
	}
}

