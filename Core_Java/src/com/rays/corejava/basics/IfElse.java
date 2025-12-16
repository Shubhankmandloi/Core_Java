package com.rays.corejava.basics;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age = sc.nextInt();
		if(age<=12)
			System.out.println("Child");
		else if (age>12&&age<=19) {
			System.out.println("Teen");
			
		}
		else
			System.out.println("Adult");

	}

}
