package seleniumTest;

public class Reverse {

public static void main(String args[])
	{

		// Input="riyaj works for Karkinos"
		// output="karkinos forworks riyaj"
		String input="riyaj works for Karkinos";
		String a[] = input.split(" "); 

		for(int i=a.length-1; i>=0;i--)
		{
			System.out.print(a[3]+" "+a[2]+""+a[1]+" "+a[0]);
			break;
		}


	}

}