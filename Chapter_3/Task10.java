// нумерация бит с конца
class Task10{
	public static void main(String[] arg){
		int i = 0xb700;
		int j = 0x00b5;
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("i & j = " + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
	}
}