package automation;

public class Palindronmes {

	public static void main(String[] args) 
	{
		String str ="mam234";
		String Ostr =str;
		String rev="";
//		int len = str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
					}
		if(Ostr.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else 
		{
			System.out.println("Not Palindrome string");
		}
	}

}
