package com.rays.collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentNameRoll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "Aman");
		hm.put(2, "Aditya");
		hm.put(3, "Bhanu");
		hm.put(4, "Charu");
		hm.put(5, "Devesh");
		
		System.out.println(hm);
		
		System.out.println("Enter Roll number to see student details...");
		int num = sc.nextInt();
		
		System.out.println(hm.get(num));
		
		

	}

}
