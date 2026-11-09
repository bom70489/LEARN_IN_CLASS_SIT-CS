import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        // ArrayList<Integer>
        // normal
        System.out.println("------ Normal Arrays ------");
        System.out.println(list);
        System.out.println("Size of Arrays : " + list.size());
        
        // remove
        System.out.println("------ Remove Apple ------");
        list.remove("Apple");
        System.out.println(list);

        // set
        System.out.println("------ Set WaterMelom ------");
        list.set(1, "WaterMelon");
        System.out.println(list);

        // contains
        System.out.println("------ Contains ------");
        System.out.println(list.contains("Mango"));
        System.out.println(list.contains("Apple"));
    }
}
