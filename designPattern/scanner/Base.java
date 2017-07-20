package designPattern.scanner;

import designPattern.scanner.Base.InnerClass;

public class Base {

	//
	// public static void main(String[] args) {
	//
	//
	//
	//
	//
	// Base base = new Base();
	// base.display1();
	// Base.NestedStaticClass baStaticClass = new Base.NestedStaticClass();
	// Base.InnerClass in = new Base().new InnerClass();
	// in.display();
	// }
	//
	public void display1() {
		System.out.println("In Base Class");
	}

	public static void display2() {
		System.out.println("In Base Class");
	}

	private static String msg = "GeeksForGeeks";

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class is directly accessible in nested
		// static class
		public void printMessage() {
			display2();
			// Try making 'message' a non-static variable, there will be
			// compiler error
			System.out.println("Message from nested static class: " + msg);
		}
	}

	// non-static nested class - also called Inner class
	public class InnerClass {

		// Both static and non-static members of Outer class are accessible in
		// this Inner class
		public void display() {
			display1();
			System.out.println("Message from non-static nested class: " + msg);
		}
	}
}

