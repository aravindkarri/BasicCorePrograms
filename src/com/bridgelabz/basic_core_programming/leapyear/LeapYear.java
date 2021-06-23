package com.bridgelabz.basic_core_programming.leapyear;

import java.util.Scanner;
/**
 * class to check given year is leap year or not
 * @author com.bridgelabz
 *
 */

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check if it is a leap year");
		int yearToCheck = sc.nextInt();
		sc.close();
		leapYear(yearToCheck);
	}
	
	/**
	 * Name : leapYear
	 * 
	 * Description : check and print the given year is leap year or not
	 * 
	 * Algorithm : Passing yearToCheck as required attribute and checking if yearToCheck is 4 digit
	 * number if yes it checks whether it is a leap year or not..else it throws an error as entered year 
	 * is not valid..
	 * Mainly it checks two conditions for leap year
	 * 1) Divisible by 4 and Not a century year
	 * 2) Century year and divisible by 400
	 * 
	 * @param yearToCheck
	 * @return string
	 * 
	 * Modification-History : initial commit on 23-Jun-2021
	 */
	public static void leapYear(int yearToCheck)
	{

		if(Integer.toString(yearToCheck).length()==4)   //calculate integer length by using string method.
		{
			if(yearToCheck%4 == 0 && yearToCheck%100 != 0)
			{
				System.out.println(yearToCheck + " is a leap year");
			}
			else if (yearToCheck%100 == 0 && yearToCheck%400 == 0 )
			{
				System.out.println(yearToCheck + " is a leap year");
			}
			else
			{
				System.out.println(yearToCheck + " is not a leap year");
			}
		}
		else
		{
			System.err.println("Entered year is not valid! ");
		}
	}
}

