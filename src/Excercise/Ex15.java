package Excercise;

import Sample.OverSpeedException;

public class Ex15 {
    public static void main(String[] args) {

        Car2 car2 = new Car2();
        try {
            car2.run(40);
        } catch (OverSpeedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            
        car2.run(200);//例外を発生させる可能性のある処理
            
        } catch (OverSpeedException e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("スピードの出し過ぎです");

        }
    }

}
