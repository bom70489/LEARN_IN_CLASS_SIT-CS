public class Decimal {
    public static void main(String[] args) {
        int num = 13;
        String result = "";

        while(num > 0) {
            int reminder = num % 2;
            result += reminder;
            num = num / 2;
        }

        System.out.println(result);
    }
}
