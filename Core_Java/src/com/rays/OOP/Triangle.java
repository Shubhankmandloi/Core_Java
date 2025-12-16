package com.rays.OOP;

import java.util.Scanner;

public class Triangle extends Shape {
	
	Scanner sc = new Scanner(System.in);
	
	private int base;
	private int height;
	

	@Override
	double area() {
		System.out.println("Enter Base : ");
		base = sc.nextInt();
		
		return 0;
	}
	
	

}
