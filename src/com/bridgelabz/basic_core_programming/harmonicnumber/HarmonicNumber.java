package com.bridgelabz.basic_core_programming.harmonicnumber;

import java.util.Scanner;
/**
 * class to calculate Nth Harmonic value
 * @author Aravind
 *
 */
public class HarmonicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter harmonic value: ");
		int num = sc.nextInt();
		double harmonicNum =0;
		if (num > 0)
		{
			for (double i=1;i<=num;i++)
			{
				harmonicNum += (1/i);
			}
			System.out.println("Nth harmonic number is :"+harmonicNum);
		}
		else
		{
			System.err.println("Enter positive value");
		}
		

	}

}

