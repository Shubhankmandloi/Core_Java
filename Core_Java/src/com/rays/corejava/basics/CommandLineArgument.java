package com.rays.corejava.basics;

public class CommandLineArgument {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		double height = Double.parseDouble(args[2]);
		
		System.out.println("My name is : "+name+" \nMy age is : "+age+"\nMy height is : "+height);
		

	}

}
