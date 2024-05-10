package DateTime;


import java.time.LocalTime;
import java.time.ZoneId;

public class Time {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(10,45,20);
        System.out.println(time1);

        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
        System.out.println(time2.getNano());

        System.out.println(time2.plusHours(2));
        System.out.println(time2.plusMinutes(10));
        System.out.println(time2.plusSeconds(5));

        System.out.println(time2.minusHours(2));
        System.out.println(time2.minusMinutes(10));
        System.out.println(time2.minusSeconds(5));

        ZoneId zone = ZoneId.of("Asia/Kolkata");
        LocalTime time3 = LocalTime.now(zone);
        System.out.println(time3);
    }
}
