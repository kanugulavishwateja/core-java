package com.tnsif.lamdaexpression;

public class Parameterdemo {
	public static void main(String[] args) {
		
		Cube t=(a)->{return(a*a*a);};
		System.out.println("cube of a number "+t.calculate(2));
		}

}