package Excercise;

import Sample.OverSpeedException;

public class Car2 {

    private int speed;
    public String getSpeed;
    
    public void run(int speed) throws OverSpeedException{

        if(speed < 0 || speed > 180){
            throw new OverSpeedException("スピードの出し過ぎです");            
        }else{
            this.speed = speed;
            System.out.println("スピードが"+speed+"km/hになりました");
            
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
