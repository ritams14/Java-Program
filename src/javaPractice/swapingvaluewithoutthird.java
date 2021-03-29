package javaPractice;

public class swapingvaluewithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 5, last = 3;
		System.out.println("Before swaping first element is : "+first);
		System.out.println("Before swaping second element is : "+last);
		
		first = first + last;
		last = first - last;
		first= first - last;
		
		System.out.println("After swaping first element is : "+first);
		System.out.println("After swaping second element is : "+last);

	}

}
