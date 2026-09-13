public class Q2 {
    public static void main(String[] args) {
        String word_1 = "Hello";
        String word_2 = "Java";
        StringBuilder rever = new StringBuilder(word_2).reverse(); 
        StringBuilder result = new StringBuilder();
        int more = (word_1.length() < word_2.length()) ? word_2.length() : word_1.length();

        for(int i = 0; i < more; i++) {
            if(i < word_1.length()) {
                result.append(word_1.charAt(i));
            }

            if(i < word_2.length()) {
                result.append(rever.charAt(i));
            }
        }

        System.out.println(result);
    }
}
