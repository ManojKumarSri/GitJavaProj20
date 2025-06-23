package org.ham;

public class Sample {
	
	private void m1() {
		System.out.println("Method---1");
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m1();
		
		int a = 10;
		System.out.println(a);

	}
}
