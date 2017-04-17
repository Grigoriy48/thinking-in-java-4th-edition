package Test;

/**
 * Created by GKazun on 17.02.2017.
 */
public class Task2 {
    public static void main (String[] args) {
        String str = new String("String");
        str = null;

        try{
            str.toString();
        }catch (Exception e){
            System.err.println("Catch exception: " + e);
        }
    }
}
