package Excercise;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        

    // うるう年である2020年2⽉の最⼤の⽇付を取得し表⽰してください
    // 2020年2⽉1⽇のLocalDateオブジェクトを⽣成してください
    // LocalDateのwith()メソッドやTemporalAdjustersクラスを利⽤して、2020年2⽉の最後の⽇付を表
    // LocalDateオブジェクトを取得してください
    // 取得したオブジェクトのgetDayOfMonth()メソッドを使⽤して
    // 2020年2⽉の最後の⽇付をint型で取得し、表⽰させてください

   LocalDate localDate = LocalDate.of(2020, 2, 1);
        
    // TemporalAdjustersのlastDayOfMonth()を使って2月の最後の日を取得
   LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        
    // 最後の日付のgetDayOfMonth()メソッドで日を取得して表示
  System.out.println("2020年2月の最後の日付: " + lastDayOfMonth.getDayOfMonth());
   }
}
