package com.rays.ExceptionHandling;

public class ArrayIndexOutOfBondExam {

	public static void main(String[] args) {
		
		
//		int[] arr = new int[5];
		
		int [] arr = {10,20,30,40,50};
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
