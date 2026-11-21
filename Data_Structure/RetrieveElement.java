import java.util.Scanner;
import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");

        int index = 2;
        try {
            System.out.println("Element at index " + index + " = " + colors.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index %d is out of bounds for this list.".formatted(index));
        }

        sc.close();
    }   
}
