import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int binary = 1101;
        int[] binarys = String.valueOf(binary).chars().map(Character::getNumericValue).toArray();
        int[] result = {};
        int[] convert = {};
        int end = 0;
        int count = 0;

        while(binary != 0) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = binary % 10;
            binary /= 10;
        }

        for(int i = result.length - 1; i >= 0; i--) {
            convert = Arrays.copyOf(convert, convert.length + 1); 
            convert[convert.length - 1] = (int) Math.pow(2, i);
        }


        for(int data : convert) {
            end += data * binarys[count++];
        }

        System.out.println(end);

    }
}
