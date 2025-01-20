package Excercise;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {

        //⾃分の誕⽣⽇を含むLocalDateを⽣成します
        //getXxx()メソッドを使⽤して、⾃分の誕⽣⽇の年、⽉、⽇をint型で取得します
        LocalDate birthDate = LocalDate.of(2000, 8, 18);


        int year = birthDate.getYear();
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();

        System.out.println("私の誕生日は"+year+"年"+month+"月"+day+"日です");

    }

    

}
