package com.rays.collection;

import java.util.HashSet;

public class HashsetDuplicateExam {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(20.22f);
		hs.add('S');
		hs.add("Aman");
		hs.add(10);
//		hs.add(arr.toString());
		
		System.out.println(hs);
		

	}

}
