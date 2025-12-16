package com.rays.corejava.basics;


class Student{
	String name;
	int rollNo;
	int marks;
	
	Student(String n,int r,int m){
		name=n;
		rollNo = r;
		marks = m;
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		
		Student s1 = new Student("Raj", 10, 80);
		System.out.println(s1.name+" : "+s1.rollNo+" : "+s1.marks);
		

	}

}
