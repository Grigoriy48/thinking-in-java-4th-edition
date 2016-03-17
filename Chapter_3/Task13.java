import java.util.*;
class Task13{
	public static void main(String[] args) {
		/* ОШИБКА
		char c;
		System.out.println(Integer.toBinaryString(c));*/
		char c = 0xffff;
		System.out.println(Integer.toBinaryString(c));
		c = 'a';
		System.out.println(Integer.toBinaryString(c));
		c = 'b';
		System.out.println(Integer.toBinaryString(c));
	}
}