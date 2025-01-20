public class Ex04 {
    public static void main(String[] args) {
        String emptyCharacter = "";
        checkIfEmpty(emptyCharacter);
    }


    public static void checkIfEmpty(String str){
        if(str.isEmpty()){
        System.out.println("空文字です");
    } else{
            System.out.println("空文字ではありません");
            }
        
    }
}



