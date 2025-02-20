package com.tnsif.collectionframework;
// demo for tree set

import java.util.TreeSet;

public class Stackdemo {
	
	public static void treesetoperation() {
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(78);
		t.add(8);
		t.add(58);
		t.add(3);
		t.add(3);
		//t.add(null);
		
		System.out.println("elements of treeset "+ t);
		
	}
	
	public static void main(String[] args) {
		Stackdemo.treesetoperation();
	}

}