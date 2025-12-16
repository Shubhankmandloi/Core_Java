package com.rays.corejava.basics;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name : ");
		
		String name = sc.nextLine();
		
		System.out.println(name);
		System.out.println(name.length());
		
//		length,touppercase,tolowercase,charAt,contains,startswith,endswith,replace,substring
		System.out.println(name.toUpperCase());
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}

	}

}
