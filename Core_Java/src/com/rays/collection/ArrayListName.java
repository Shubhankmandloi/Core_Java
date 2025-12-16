package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListName {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Zaheer");
		list.add("Jack");
		list.add("Hansh");
		list.add("Bhanu");
		list.add("Aman");

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}

}
