import java.util.Scanner;
import java.util.StringTokenizer;

interface Calculator {
    public abstract double getResult();
    public abstract void clear();
    public abstract void add(double input);
    public abstract void substract(double input);
    public abstract void divide(double input);
	public abstract void multiply(double input);
}

public class Cal {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BasicCalculator cal = new BasicCalculator();
		String expression = sc.nextLine();
		StringTokenizer st = new StringTokenizer(expression);
		int count = 1;
		String operator = "";
	    while (st.hasMoreTokens()) {
	        //System.out.println(st.nextToken());
	        if(count==1){
				cal.add(Double.parseDouble(st.nextToken()));
			}
			else{
				if(count%2==1){
					operator = st.nextToken();
				}
				else{
					switch(operator){
						case "+": cal.add(Double.parseDouble(st.nextToken())); break;
						case "-": cal.substract(Double.parseDouble(st.nextToken())); break;
						case "/": cal.divide(Double.parseDouble(st.nextToken())); break;
						case "*": cal.multiply(Double.parseDouble(st.nextToken())); break;
					}
				}
			}
	        count++;
	    }
	    System.out.println(cal.getResult());
		sc.close();
	}
}

class BasicCalculator implements Calculator {
	private double result;

	BasicCalculator() {
		this.result = 0;
	}

	@Override
	public void add(double input) {
		result += input; 
	}

	@Override 
	public void substract(double input) {
		result -= input;
	}

	@Override 
	public void divide(double input) {
		result /= input;
	}

	@Override 
	public void multiply(double input) {
		result *= input;
	}

	@Override
	public void clear() {
		this.result = 0;
	}

	@Override 
	public double getResult() {
		return result;
	}
}