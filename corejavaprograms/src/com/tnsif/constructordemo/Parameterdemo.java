package com.tnsif.constructordemo;
//demo for parameter constructor
public class Parameterdemo {
Parameterdemo(){
	System.out.println("default");
}
Parameterdemo(int a){
	System.out.println("one parameter");
}
Parameterdemo(int a,String b){
	System.out.println("2 parameter");
}
public static void main(String[] args) {
	Parameterdemo d=new
			Parameter();
}
}
