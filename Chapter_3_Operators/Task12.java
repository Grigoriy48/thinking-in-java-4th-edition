class Task12{
	public static void main(String[] args) {
		int i = 0xFF;
		System.out.println(Integer.toBinaryString(i));
		i<<=1;
		System.out.println(Integer.toBinaryString(i));
		for(; i != 1 ; i >>>= 1) {	
			System.out.println(Integer.toBinaryString(i));
		}
		System.out.println(Integer.toBinaryString(i));
	}
}