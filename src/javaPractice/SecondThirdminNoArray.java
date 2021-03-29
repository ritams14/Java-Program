package javaPractice;

public class SecondThirdminNoArray {
	
	static void findSecondThirdSmallest(int arr[], int n)
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		for (int i =0; i<n; i++)
		{
			if(arr[i] < first)
			{
				third = second;
				second = first;
				first = arr[i];
			}
			
		else if(arr[i] < second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i] < third)
			{
				third =  arr[i];
			}
		}
		System.out.println("First Min No is : "+first);
		System.out.println("Second Min No is : "+second);
		System.out.println("Third Min No is : "+third);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,5,1,9,10};
		int n = arr.length;
		findSecondThirdSmallest(arr, n);
	}

}
