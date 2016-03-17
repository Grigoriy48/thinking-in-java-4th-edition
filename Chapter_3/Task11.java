class Task11{
	public static void main(String[] args) {
		int i = 0x10000000;
		System.out.println(Integer.toBinaryString(i));
		for(; i != 1 ; i >>>= 1) {	
			System.out.println(Integer.toBinaryString(i));
		}
		System.out.println(Integer.toBinaryString(i));
	}
}