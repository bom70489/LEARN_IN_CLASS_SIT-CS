import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalTime;


public class FlightTime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Departure Time : ");
        String departure = sc.next();
        System.out.print("Arrive Time : ");
        String arrive = sc.next();

        // Pattern allow 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[HHmm][Hmm]");

        // Parse string to LocalTime object
        LocalTime statTime = LocalTime.parse(departure , formatter);
        LocalTime endTime = LocalTime.parse(arrive , formatter);

        // calculate
        Duration duration = Duration.between(statTime, endTime);

        // Extract hours and remaining minutes
        long hours = duration.toHours();
        long minutes =  duration.toMinutesPart();

        System.out.print("Duration : %d hour(s) %d minute(s) ".formatted(hours , minutes));
        sc.close();
    }
}