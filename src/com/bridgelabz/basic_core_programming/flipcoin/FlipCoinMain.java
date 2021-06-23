package com.bridgelabz.basic_core_programming.flipcoin;

import java.util.Scanner;

/**
 * class to flip a coin and give percentage of heads and tails
 * @author com.bridgelabz
 */

public class FlipCoinMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times do you want to flip coin : ");
		int numOfFlips = sc.nextInt();
		sc.close();
		flip(numOfFlips);
	}
	/**
	 * Name : flip
	 * 
	 * Description : method to flip a coin
	 * 
	 * Algorithm: Passing numOfFlips as required attributes and checking if the 
	 * numOfFlips is less than or equal to zero if yes throwing an error
	 * else calculating numOfHeads
	 * 
	 * @param numOfFlips
	 * @return int
	 * 
	 * Modification-History: initial commit on 23-JUNE-2021
	 */
	public static void flip(int numOfFlips) {
		if (numOfFlips <= 0)
		{
			System.err.println("Enter a positive number: ");
		}
		else
		{
			int headCount=0;
			for (int i=1;i<=numOfFlips;i++)
			{
				if (Math.random()>0.5)
				{
					headCount++;	
				}
			}
			calcPercentage(numOfFlips, headCount);  //Calling calcPercentage method
		}
	}
	/**
	 * Name : calcPercentage
	 * 
	 * Description : method to calculate percentage of both head and tails.
	 * 
	 * Algorithm : Passing numOfFilps and headCount as required attributes and calculating percentage
	 * of head and tails.
	 * 
	 * @param numOfFlips
	 * @param headCount
	 * @return float
	 */
	public static void calcPercentage(int numOfFlips, int headCount) {
		double headPercentage = (headCount*100)/numOfFlips;
		double tailPercentage = (100-headPercentage);
		System.out.println("head percentage "+headPercentage);
		System.out.println("head percentage "+tailPercentage);
	}

}

