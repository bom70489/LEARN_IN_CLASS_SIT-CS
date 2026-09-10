public class StringComparison {
    public static void main(String[] args) {
        // String Literal (String Pool)
        String s1 = "hello";
        String s2 = "hello";

        // Explicit new String (Heap)
        String s3 = new String("hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different references)
        
        // Correct way to compare content
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same value)
    }
}
