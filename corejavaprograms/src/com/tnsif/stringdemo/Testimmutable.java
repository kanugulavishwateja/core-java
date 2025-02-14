package com.tnsif.stringdemo;
// string program

public class Testimmutable {
	
	public static void main(String[] args) {
		String s="Vishwateja";  // literals
		s.concat(" Kanugula");
		
		System.out.println(s);
		s=s.concat(" Kanugula");
		System.out.println(s);
	}

}
