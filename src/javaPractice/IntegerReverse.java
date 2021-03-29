package javaPractice;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 1234, reverse = 0, r;
		System.out.println("Before Reverse : "+no);
		
		while(no!=0)
		{
			r = no % 10;
			reverse = reverse * 10 + r;
			no /= 10;
		}
		
		
		System.out.println("After Reverse : "+reverse);
	}

}
