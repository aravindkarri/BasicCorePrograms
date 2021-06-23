package com.bridgelabz.basic_core_programming.poweroftwo;

import java.util.Scanner;
/**
 * class to calculate and print a table of powers of 2
 * @author Aravind
 *
 */

public class PowerOfTwo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power value: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("==========================");
		System.out.println("i       2 to power i   ");
		System.out.println("==========================");
		//2^31 overflows an int so here i take exponent values b/w o to 31
		if (n>=0 && n<31)
		{
			for (int i=0;i<=n;i++)
			{
				int res = (int) Math.pow(2, i); 
				System.out.println(i+"            "+res);
			}
		}
		else
		{
			System.out.println("Enter valid number b/w 0 to 31");
		}
	}

}
