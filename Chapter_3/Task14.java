class Task14{
	static void compare (String a, String b){
		System.out.println( a + " " + b );
		System.out.println(a == b); // сравнение объектов, если примитив - истина, если не примитив - ложб
		System.out.println(a.equals(b)); //
		System.out.println(b.equals(a));
		System.out.println(a != b); // сравнение объектов, если примитив (одинаковые), то ложь
		// f(!s);
		//f(!t);
		// s = s && t;
		// s = s || t;
		// s = ~t;
		// s = s  & t;
		// s = s | t;
		// s = s ^ t;
		// s &= t;
		// s ^= t;
		// s |= t;	
	}
	public static void main(String[] args) {
		Task14.compare(args[0],args[1]);
		Task14.compare("a","b");
		Task14.compare("a","a");
	}
}