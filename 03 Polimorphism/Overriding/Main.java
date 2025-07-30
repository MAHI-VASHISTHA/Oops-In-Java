package Overriding;

public class Main {

	public static void main(String[] args) {

		Animal a=new Animal();
		a.run();
		
		System.out.println();
		
		Lion l=new Lion();
		l.eat();
		l.run();
	}

}
