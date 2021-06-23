package com.bridgelabz.basic_core_programming.evenorodd;

import java.util.Scanner;
/**
 * class to check given number is even or odd
 * @author Aravind
 */
public class EvenOrOdd {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is even or odd : ");
		int num = sc.nextInt();
		if (num%2 == 0)
		{
			System.out.println(num+ " is even number");
		}
		else
		{
			System.out.println(num + " is odd number");
		}
	}
}
