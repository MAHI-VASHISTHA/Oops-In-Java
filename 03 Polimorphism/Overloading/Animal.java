package Overloading;

public class Animal {

	public void eat() {
		System.out.println("eating food");

	}

	public void eat(String type) {
		System.out.println("eating non-veg");
	}

	public void eat(String type,int legs) {
		System.out.println("has 4 legs");
	}
	
	public void eat(int legs,String type) {
		System.out.println("has 4 legs");
	}

}
