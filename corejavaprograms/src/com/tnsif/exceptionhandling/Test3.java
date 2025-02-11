package com.tnsif.exceptionhandling;
//exception with no matching catch block
public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getMessage());
		}
		finally {
			System.out.println("hello java");
		}
}
}