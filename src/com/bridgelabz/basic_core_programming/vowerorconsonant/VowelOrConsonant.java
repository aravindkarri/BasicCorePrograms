package com.bridgelabz.basic_core_programming.vowerorconsonant;

import java.util.Scanner;
/**
 * class to check given character is vowel or consonant
 * @author Aravind
 *
 */

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet to check it is vowel or consonant :");
		char ch = sc.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'|| ch == 'I'|| ch == 'O' ||ch == 'U')
		{
			System.out.println(ch +" is an vowel");
		}
		else
		{
			System.out.println(ch+" is an consonant");
		}

	}

}
