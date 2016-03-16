import java.util.*;
public class Task7{
	public static void main(String[] args){
		Random rand = new Random();
		int coin = rand.nextInt(100);
		if(coin >= 50)
			System.out.println("Eagly");
		else
			System.out.println("Tails");
	}
}