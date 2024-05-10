package DateTime;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date is "+date);
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Yesterday : "+yesterday);
        LocalDate tommorow = date.plusDays(1);
        System.out.println("Tommorow : "+tommorow);


        System.out.println(date.getYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.plusMonths(2));

        LocalDate date1 = LocalDate.of(2021,10,14);
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.lengthOfMonth());
        System.out.println(date1.lengthOfYear());
        System.out.println(date1.getDayOfYear());
        String str = "2012-10-12";
        LocalDate date2 = LocalDate.parse(str);
        System.out.println("Showing date by parse method :- "+date2);
    }
}
