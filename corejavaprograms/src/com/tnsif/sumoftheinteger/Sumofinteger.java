package com.tnsif.sumoftheinteger;

import java.util.Scanner;

public class Sumofinteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0;
        int vishwa = number;

        while (vishwa > 0) {
            int digit = vishwa % 10;
            sum += digit;
            vishwa /= 10;
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);

        input.close(); // Close the Scanner
    }
}