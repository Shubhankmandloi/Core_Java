package com.rays.OOP;

import java.util.Scanner;

public class Circle extends Shape{
	
	Scanner sc = new Scanner(System.in);
	
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	
	

	@Override
	double area() {
		System.out.println("Enter Radius of circle.");
		radius = sc.nextInt();
		return Math.PI*radius*radius;
	}

}
