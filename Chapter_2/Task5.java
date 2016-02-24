public class Task5 {
	public static void main(String[] args){
		class DataOnly{
			int i;
			double d;
			boolean b;
		}
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("i = " + data.i);
		System.out.println("d = " + data.d);
		System.out.println("b = " + data.b);
	}
}