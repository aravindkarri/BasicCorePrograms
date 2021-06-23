package com.bridgelabz.basic_core_programming.largestnumber;

import java.util.Scanner;
/**
 * class to check biggest number among three numbers
 * @author Aravind
 */

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a = sc.nextInt();
		System.out.print("Enter the second number :");
		int b = sc.nextInt();
		System.out.print("Enter the third number :");
		int c = sc.nextInt();
		sc.close();
		if(a>b && a>c)
		{
			System.out.println("Largest number is :" +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest number is :" +b);
		}
		else
		{
			System.out.println("Largest number is :" +c);
		}
	}
}
