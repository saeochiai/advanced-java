package Sample;

import java.time.LocalDateTime;

public class DateTimeSample3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1018,1,2,3,4,5,999999999);
        System.out.println("日付と時間:"+localDateTime);

        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);
        localDateTime = localDateTime.plusNanos(7);
        System.out.println("進めた後︓" + localDateTime);


        localDateTime = localDateTime.minusYears(1);
        localDateTime = localDateTime.minusMonths(2);
        localDateTime = localDateTime.minusDays(3);
        localDateTime = localDateTime.minusHours(4);
        localDateTime = localDateTime.minusMinutes(5);
        localDateTime = localDateTime.minusSeconds(6);
        localDateTime = localDateTime.minusNanos(7);
        System.out.println("戻した後︓" + localDateTime);

        localDateTime = localDateTime.minusWeeks(2);
        System.out.println("2週間前︓" + localDateTime);


    }

}
