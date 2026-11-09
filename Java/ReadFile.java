// import java.util.Calendar;
import java.io.File;
import java.util.Scanner;

public class ReadFile {
    // throws Exceptiona
    public static void main(String[] args) throws Exception {
        File f = new File("score.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String data[] = line.split(",");
            int price = Integer.parseInt(data[1]);
            int qty = Integer.parseInt(data[2]);
            System.out.printf("%-20s %10d %5d%n", data[0] , price, qty);
        }
        
        sc.close();
    }
}