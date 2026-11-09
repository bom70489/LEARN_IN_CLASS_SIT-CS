// import java.util.Calendar;
import java.io.File;
import java.io.PrintWriter;

public class WriteFile {
    // throws Exceptiona
    public static void main(String[] args) throws Exception {
        File f = new File("scores.txt");

        if(f.exists()) {
            System.out.println("Have this file already!");
            System.exit(0);
        }

        PrintWriter out = new PrintWriter(f);

        out.println("Hello, My name is Pakapol.");
        out.println("I'm 20 year old.");
        out.println("I'm computer science student.");
        
        out.close();
    }
}