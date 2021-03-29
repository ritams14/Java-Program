package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n = scr.nextInt();
		int fact = 1;
		for(int i = 1; i<= n; i++)
		{
			fact = fact * i;
			System.out.println("Factorial of " + i + " is : "+fact);
		}
		System.out.println("Factorial of " + n + " is : "+fact);
	}

}
