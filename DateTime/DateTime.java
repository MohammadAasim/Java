package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting : "+now);
        System.out.println(now.plusDays(10));
        System.out.println(now.minusDays(20));

        //formater
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy mm:HH:ss");
        String formatDateTime = now.format(format);
        System.out.println("After formatting : "+formatDateTime);
    }
}
