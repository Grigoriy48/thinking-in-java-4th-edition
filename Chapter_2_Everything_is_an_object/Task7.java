class StaticTest{
	static int i = 47;
}
class Incrementable{
	static void increment() { StaticTest.i++; }
}
public class Task7{
	public static void main(String[] args){
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println("i = " + StaticTest.i);
		Incrementable.increment();
		System.out.println("i = " + StaticTest.i);
	}
}