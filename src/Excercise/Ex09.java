package Excercise;

import java.time.LocalDateTime;

public class Ex09 {
    public static void main(String[] args) {

// 2020年1⽉1⽇0時0分0秒の1年2か⽉3⽇4時間5分6秒後を表⽰させてください
// 2020年1⽉1⽇0時0分0秒を表すlocalDateTimeオブジェクトを⽣成してください
// ⽣成したオブジェクトのplusXxxx()メソッドを利⽤して1年2か⽉3⽇4時間5分6秒後の
// localDateTimeオブジェクトを取得してください

        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 0, 0, 0);

        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);
        
        System.out.println(localDateTime);
    }

}
