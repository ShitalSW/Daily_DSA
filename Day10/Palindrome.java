package Day10;

import java.util.Scanner;

class Palidrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numer");
		int num=sc.nextInt();
		palindrome(num);
	}
	public static void palindrome(int num)
	{
		int original=num;
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(rev==original)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
