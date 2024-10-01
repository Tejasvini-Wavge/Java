package com.type1;

import java.util.Scanner;

public class Maximum3 { 

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter frist number");
		int a = sc.nextInt();

		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Enter third number");
		int c = sc.nextInt();

		// || or true || false =true
		// && and true && true == true
		// == comparison

		if (a == b && b == c) 
		{ //10==10 && 10==10
			System.out.println("three are same");
		}
		else
		{
			if (a >= b &&  a>= c ) 
			
			{
				if (a == b) 
				{
					System.out.println("a and b are same & grater");
					
				}
				  else if (a == c)
				{
					System.out.println("a and c is same and grater");
				}
				  else 
				  {
					System.out.println("a is grater");
				  }
				
			}
			else if(b>=c)
			{
				if(b==c)
				{
					System.out.println("b and c is same and grater");
				}
				else {
					System.out.println("b is grater");
				}
			}
			else {
				System.out.println("c is grater");
			}
			
			// 2^3  2*2*2=8
			//4^3   4*4*4=64

}
}
}