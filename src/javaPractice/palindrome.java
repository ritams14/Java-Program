package javaPractice;

public class palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 453, sum = 0, r , temp;
		temp = no;
		
		while(no != 0)
		{
			r = no % 10;
			sum = sum * 10 + r;
			no /= 10;
		}
		
		if(temp == sum)
		{
			System.out.println(temp +" is a palindrome no");
		}
		else
		{
			System.out.println(temp +" is not a palindrome no");
		}
	}

}
