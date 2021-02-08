package com.abc;

public class First {
	public static void main(String args[]) {
		System.out.println("hello");
		First f = new First();
		f.add(2);
		f.sub();
		f.mul(2, 3);
		f.div("vinay");
		
		f.add1(2, 2.2);

	}

	public void add(int a) {
		System.out.println(a);
	}

	public int sub() {
		System.out.println("sub");
		return 0;

	}

	public String mul(int a, int b) {
		System.out.println(a + b);
		System.out.println("mul");
		return null;

	}

	public String div(String s) {
		System.out.println(s);
		return s;

	}

	public double add1(int a, double b) {
		System.out.println(a + b);
		return 0;
	}

}
