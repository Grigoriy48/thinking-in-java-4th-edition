class StaticTest {
	static int i = 47;
}

public class Task8 {
	public static void main (String[] args){
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println(" st1.i = " + st1.i);
		System.out.println(" st2.i = " + st2.i);
		st1.i++;
		System.out.println(" st1.i = " + st1.i);
		System.out.println(" st2.i = " + st2.i);
	}
}