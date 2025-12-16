package com.rays.corejava.basics;

class Animal{
	
	public void eat() {
		System.out.println("Eating Food");
	}
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Eating Dog");
	}
	
}

class Puppy extends Dog{
	public void eat() {
		System.out.println("Puppy is Drinking milk");
	}
}


public class InheritanceExam {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		Dog d = new Dog();
		d.eat();
		Animal a = new Animal();
		a.eat();

	}

}
