
package javaPractice;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int c = 0, a, temp;
		int n = scr.nextInt();
		temp = n;
		while(n != 0)
		{
			a = n % 10;
			n = n / 10;
			c = c + ( a * a * a);
		}
		if(temp == c)
		{
			System.out.println(temp+ " is a amstrong no");
		}
		else
		{
			System.out.println(temp+ " is not a amstrong no");
		}
	}

}
