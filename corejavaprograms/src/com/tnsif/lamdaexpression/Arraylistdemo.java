package com.tnsif.lamdaexpression;
//example for collection

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(9);
		
		// traverse to the list
		
		a.forEach(list->System.out.println(list));

	}

}