import java.util.Scanner;

class Cat{
	boolean hasFur;
	String color, breed;
	int legs;
	
	public void walk(){
		System.out.println("Cat is Walking");
	}
	public void eat(){
		System.out.println("Cat is eating");
	}
}


public class Object_of_Class{
	public static void main(String[] args){
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.walk();
		cat1.eat();
		cat2.eat();
	}
}
