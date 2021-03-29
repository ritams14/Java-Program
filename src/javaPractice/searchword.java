package javaPractice;

public class searchword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val = "Ritam Singha";
		String val2 = "Ritam Singha is a good boy !!!";
		System.out.println("t found in " +val.indexOf("t") + " index");
		System.out.println("a found from last is " +val.lastIndexOf("a") + " index");
		System.out.println("Ritam found in " +val.indexOf("Ritam") + " index");
		System.out.println("boy found from last is " +val2.lastIndexOf("good") + " index");

	}

}
