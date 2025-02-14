package com.tnsif.stringdemo;
//example 2
public class Immuntableexample {
	
	public static void main(String[] args) {
		String s1="sachin";
		String s2=s1;
		String s3=s2;
		
		System.out.println("before modification");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		System.out.println("s3 "+s3);
		
		s1="tendulkar";
		
		System.out.println("after modification");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		System.out.println("s3 "+s3);
		
		
	}

}

