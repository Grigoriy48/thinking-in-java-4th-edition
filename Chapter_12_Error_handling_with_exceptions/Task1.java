package Test;

/**
 * Created by GKazun on 17.02.2017.
 */

 class MyException extends Exception{
    public MyException(String str){
        System.err.println(str);
    }
}

public class Task1 {
    public static void main(String[] args){
        try{
            System.err.println("Start block try");
            throw new MyException("Throw exception");
        }catch (MyException e){
            System.err.println("Block catch: " + e);
        }finally {
            System.err.println("Block finally");
        }
    }
}

