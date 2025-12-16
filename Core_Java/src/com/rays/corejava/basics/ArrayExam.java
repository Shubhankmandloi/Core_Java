package com.rays.corejava.basics;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter array size : ");
		
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		int i =0;
		while(i<size) {
			System.out.println("Enter "+i+" Element");
			arr[i] = sc.nextInt();
			i++;
		}
		
		int sum = 0;
		
		
		for(int a:arr) {
			System.out.print(a+" ");
			sum = sum + a;
		}
		
		System.out.println("\nSum is : "+sum);

	}

}
