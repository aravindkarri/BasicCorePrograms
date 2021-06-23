package com.bridgelabz.basic_core_programming.swaptwonumbers;

import java.util.Scanner;

/**
 * class to Swap given two numbers
 * @author Aravind
 *
 */

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to perform swapping : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		//swapping two numbers
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("first number after swapping "+num1);
		System.out.println("second number after swapping "+num2);
	}
}
