package com.rays.corejava.basics;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.println("Before Swapping Num = "+a+" , "+b);
		
//		Using 3rd variable
//		int c = a;
//		a = b;
//		b = c;
		
//		Without Third variable
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		 
//		Using Bitwise XOR Operator
//		a = 5  -> 0101 (binary)
//				b = 7  -> 0111 (binary)
//
//				XOR Operation: a ^ b
//
//				   0101
//				^  0111
//				------
//				 0010  -> 2 (decimal)
		
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;
		
//		Using Array
		
		int [] arr = {a,b};
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;


		
//		System.out.println("After Swapping Num = "+a+" , "+b);
		System.out.println("After Swapping Num = "+arr.toString());

	}

}
