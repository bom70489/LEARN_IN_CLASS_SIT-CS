import java.util.ArrayList;
import java.util.Iterator;

public class InteratorExaemple {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("Remove : " + list);
    }   
}
