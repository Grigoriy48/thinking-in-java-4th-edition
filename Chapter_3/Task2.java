/*
Синонимия(aliasing)
с2 присваивается ссылка на с1
*/
class Car{
	float volume;
}

public class Task2{
	 public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1.volume = 1.4f;
		c2.volume = 1.5f;
		System.out.println("c1.volume = " + c1.volume);
		System.out.println("c2.volume = " + c2.volume);
		c1.volume = 1.6f;
		System.out.println("c1.volume = " + c1.volume);
		System.out.println("c2.volume = " + c2.volume);
		c2 = c1;
		System.out.println("c1.volume = " + c1.volume);
		System.out.println("c2.volume = " + c2.volume);
		c1.volume = 1.8f;
		System.out.println("c1.volume = " + c1.volume);
		System.out.println("c2.volume = " + c2.volume);
	}
}