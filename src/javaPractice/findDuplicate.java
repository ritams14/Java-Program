package javaPractice;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[]{1, 2, 3, 4, 2, 6, 5, 3};
		
		for(int i=0; i<=arr.length; i++)
		{
			for(int j = i+1; j<=arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate no is : "+arr[i]);
				}
			}
		}

	}

}
