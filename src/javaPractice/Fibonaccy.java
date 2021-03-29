package javaPractice;

import java.util.Scanner;

public class Fibonaccy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n = scr.nextInt();
		int first = 0, last = 1;
		
		for(int i = 1; i<=n; ++i)
		{
			System.out.print(first + " ");
			int sum = first + last;
			first = last;
			last = sum;
		}
	}

}
