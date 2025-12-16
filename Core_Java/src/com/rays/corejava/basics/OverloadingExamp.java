

package com.rays.corejava.basics;


class MathOps{
	public void add(Double a,Double b) {
		System.out.println("Sum is : "+(a+b));
	}
	
	public void add(Double a,Double b,Double c) {
		System.out.println("Sum is : "+(a+b+c));
	}
}

public class OverloadingExamp {

	public static void main(String[] args) {
		
		MathOps m = new MathOps();
		m.add(20.0, 30.5);
		m.add(20.2, 30.4, 40.4);
		

	}

}
