package com.rays.collection;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(1, "Akshat");
		hs.put(2, "Aditya");
		hs.put(3, "Bhanu");
		hs.put(4, "Chanchal");
		hs.put(4, "Devesh");
		hs.put(4, "Aonny"); 
		
//		put,get,remove,containskey,keyset,values
		
		System.out.println(hs);
		
		System.out.println(hs.get(4));
		
		hs.remove(4);
		System.out.println(hs);

	}

}
