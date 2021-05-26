package org.programs;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		
		String t = "";
		char c[] = s.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) 
		{
			t=t+c[i];
			
		}
		
		System.out.println("Input : "+s);
		System.out.println("Reverse : "+t);
		
		if(t.equalsIgnoreCase(s))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is Not Palindrome");
		}
		
	}

}
