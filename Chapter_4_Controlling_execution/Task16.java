class Task16{
	static void test(int x, int y){
		if(x < y)
			System.out.print(x + " < " + y);
		else if(x > y)
			System.out.print(x + " > " + y);
		else 
			System.out.print(x + " = " + y);
	}
	public static void main(String[] args){
		int x,y;
		for(int i = 1; i <=25; i++){
			x = Math.random();
			y = Math.random();
			test(x,y);
		}
	}
}