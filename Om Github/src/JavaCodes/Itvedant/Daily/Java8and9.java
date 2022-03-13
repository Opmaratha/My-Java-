package JavaCodes.Itvedant.Daily;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Java8and9 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        today=today.plusDays(1);
        System.out.println(today);
        today=today.minusDays(2);
        System.out.println(today);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
