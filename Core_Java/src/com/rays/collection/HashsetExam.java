package com.rays.collection;

import java.util.HashSet;

public class HashsetExam {

	public static void main(String[] args) {
		
//		Duplicate not allowed.
		
		HashSet  hs = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		
		System.out.println(hs); 

	}

}
