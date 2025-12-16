package com.rays.ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String msg) {
		
		super(msg);
		
	}
}


public class CustomExceptionExam {

	public static void main(String[] args) throws MyException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age<18)
			throw new MyException("Not Eligible Exception");

	}

}
