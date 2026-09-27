public class Min_Max {
    public static void main(String[] args) {
        int[] numbers = {83 , 100 , 230 , 2 , 5};
        int max = numbers[0];
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            } 

            if(min > numbers[i]) {
                min = numbers[i];
            } 
        } 


        System.out.println("Max = " + max + ", Min = " + min);
        
    }
}
