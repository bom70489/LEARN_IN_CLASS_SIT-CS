import java.util.Scanner;

public class Bisection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double tolerance = sc.nextDouble();

        // formula
        // c1 + c2(x - sinx)
        
        double xns;
        double cal_tolerance;

        while(true) {
            xns = (a + b) / 2.0;
            
            cal_tolerance = (b - a) / 2.0; 

            if(cal_tolerance < tolerance) {
                break;
            }

            double fa = c1 +  c2 * (a - Math.sin(a));
            double fxns = c1 + c2 * (xns - Math.sin(xns));
 
            if(fa * fxns < 0) {
                b = xns;
            } else if(fa * fxns > 0) {
                a = xns;
            }
        }   

        System.out.println(xns);
        sc.close();
    }
}
