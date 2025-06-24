package org.ham;

public class Sample {

	public static String name = "SmartSkills";

	private void m1() {
		System.out.println("Method---1");
	}

	public static void main(String[] args) {

		int a = 10, b = 30 , c = 30;
		System.out.println(a);

		System.out.println(b);

		System.out.println(c);
		
		System.out.println(name);

		Sample s = new Sample();
		s.m1();

	}
}
