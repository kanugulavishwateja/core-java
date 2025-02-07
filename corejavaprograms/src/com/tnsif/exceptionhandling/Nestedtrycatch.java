package com.tnsif.exceptionhandling;
// demo for nested try catch

public class Nestedtrycatch {
	
	public static void check() {
		String str="TNS";
		int slength =str.length();
		
		System.out.println("string length "+slength);
		
		String anotherstring=null;
		
		int y=6;
		try {
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("index out of bound "+ex.getMessage());
		}
		System.out.println("string length"+anotherstring.length());
	}
catch(NullPointerException e) {
	System.out.println("exception "+e.getMessage());
}

}
}