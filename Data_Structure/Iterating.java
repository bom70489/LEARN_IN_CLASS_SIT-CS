import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");

        System.out.print("Standart for : ");
        for(int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");
        }
        System.out.println();

        System.out.print("For-Each : ");
        for(String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.print("Iterator : ");
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        sc.close();
    }
}
