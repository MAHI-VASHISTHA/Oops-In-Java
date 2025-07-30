package Overloading;

public class Lion {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.eat();
		a.eat("non -veg");
		a.eat("fish", 4);
	}
}
