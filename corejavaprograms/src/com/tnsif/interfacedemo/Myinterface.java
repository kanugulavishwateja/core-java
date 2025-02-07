package com.tnsif.interfacedemo;
//demo for nested interface
public interface Myinterface {
	void calucatearea(); 
	// Abstract method
	
	interface Myinnerinterface{
	// nested interface
		int id=30;
		void print();
		
	}

}