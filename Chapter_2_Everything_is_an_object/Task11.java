class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors = newHue;
	}
}

public  class Task11{
	public static void main(String[] args){	
		AllTheColorsOfTheRainbow acr = new AllTheColorsOfTheRainbow();
		System.out.println("anIntegerRepresentingColors = " + acr.anIntegerRepresentingColors);
		acr.changeTheHueOfTheColor(10);
		System.out.println("anIntegerRepresentingColors = " + acr.anIntegerRepresentingColors);
	}
}