/*
== - для примитовов. если приминить для объектов, то сравниваются ссылки
equals() для объектов, но если применять для своих классов, то сравнивваются ссылки
*/
class Dog{
	String name;
	String says;
}

public class Task6{
	public static void main(String[] args){
		Dog a = new Dog();
		Dog b = new Dog();
		a.name = "spot";
		a.says = "woof";
		b.name = "scruffy";
		b.says = "roof";
		System.out.println(a.name + " says: " + a.says);
		System.out.println(b.name + " says: " + b.says);

		Dog c = new Dog();
		c.name = "Jack";
		c.says = "hello!";
		System.out.println("spot == jack: " + (a == c)); //разные ссылки
		System.out.println("spot != jack: " + (a != c));
		System.out.println("spot.equals(jack): " + a.equals(c));//equals для объектов, но по умолчанию сравнивает ссылки
		a = c;
		System.out.println("spot == jack: " + (a == c)); //ссылки стали одиаковые
		System.out.println("spot != jack: " + (a != c));
		System.out.println("spot.equals(jack): " + a.equals(c)); //ссылки стали одиаковые
	}
}