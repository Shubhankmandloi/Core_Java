package com.rays.ExceptionHandling;

import java.util.Scanner;

public class ArithmaticExceptionExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();


		try {

			double d = num1 / num2;
			System.out.println(d);

		} catch (ArithmeticException e) {
			
			e.printStackTrace();

		}

	}

}
