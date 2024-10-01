package com.type1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		// 123  op =321
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int n=sc.nextInt(); //123
		int num=n;
		
		int ans=0; //0
		int rem;  //0
		
		
		while(n>0) //start 123>0 true
			       //12>0 true
			       //1>0  true
			       //0>0  false
		{
			
			rem=n%10; //123%10 ==3
			          // 12%10 ==2
			          //1%10  ==1
			
			ans=ans*10+rem;  //0*10+3===3
			                 //3*10+2==32
			                 //32*10+1==321
			
			n=n/10; // 123/10==12
			        //12/10==1
			        //1/10==0
			
		}
		
		if(num==ans)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome ");
		}
		
		System.out.println(ans);
		
		
		
		

	}

}