package Excercise;

public class Ex12 {
    public static void main(String[] args){
        try{
        int answer = 10/0;
        }catch(Exception e){
            System.out.println("0で割ることが出来ません");
        }
    }

}
