package com.tnsif.evenorodd;

public class Eevenorodd {
	public static void main(String[]args) {
        int number = 10; 

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        //Example of using a function.
        int num2 = 15;
        if(isEven(num2)){
            System.out.println(num2 + " is even.");
        } else {
            System.out.println(num2 + " is odd.");
        }

    }

    //A function to determine if a number is even.
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}