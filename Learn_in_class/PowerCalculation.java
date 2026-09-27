public class PowerCalculation {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int result = 1;

        for(int i = 1; i <= y; i++) {
            result *= x;
        }
        
        System.out.println(result);
    }
}
