class Dog{
	String name;
	String says;
}

public class Task5{
	public static void main(String[] args){
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot";
		spot.says = "woof";
		scruffy.name = "scruffy";
		scruffy.says = "roof";
		System.out.println(spot.name + " says: " + spot.says);
		System.out.println(scruffy.name + " says: " + scruffy.says);
	}
}