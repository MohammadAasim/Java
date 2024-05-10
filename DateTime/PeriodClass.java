package DateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
public class PeriodClass {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);

        Period p = Period.of(2024,10,9);
        System.out.println(p.toString());

        Period p1 = Period.ofMonths(10);
        Period p2 = p1.minus(Period.ofMonths(1));
        System.out.println(p2);

        Period p3 = p1.plus(Period.ofMonths(5));
        System.out.println(p3);

    }
}
