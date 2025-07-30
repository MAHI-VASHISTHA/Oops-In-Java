package Package2;

import Package1.Student;

public class Student1 extends Student{

public static void main(String[] args) {
		
		Student1 st1=new Student1 ();
		
		System.out.println(st1.id=102);
		System.out.println(st1.addr="muzaffarnagar");
		System.out.println(st1.name="mahi vashistha");
		
		
		st1.read();
		st1.run();
	}
}
