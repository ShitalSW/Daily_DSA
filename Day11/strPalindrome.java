package Day11;

import java.util.Scanner;

public class strPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(strPalindrome(str));
	
	}
	public static String strPalindrome(String str)
	{
		int n=str.length();
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i)!=str.charAt(n-1-i))
			{	
				return "Not a Palindrome";
			}
		}
		return "Is Palindrome";
	}

}
