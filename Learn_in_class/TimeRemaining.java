import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.Duration;

public class TimeRemaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pattern allow 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[kkmm][kmm]");
        System.out.print("Current time : ");
        String time = sc.next();
        LocalTime midnight = LocalTime.MAX;


        // Parse string to LocalTime object
        LocalTime currentTime = LocalTime.parse(time , formatter);

        // calculate duration
        Duration cal = Duration.between(currentTime , midnight);

        // Extract hours and minutes
        long hours = cal.toHours();
        long minutes = cal.toMinutesPart() + 1;

        if(minutes == 60) {
            hours += 1;
            minutes = 0;
        }

        System.out.print("Time left: %d hour(s) %d minute(s)".formatted(hours , minutes));

        sc.close();

    }
}
