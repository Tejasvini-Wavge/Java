package com.type1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter power");
		int no=sc.nextInt();  //3
		 
		 System.out.println("Enter number");
		 int x=sc.nextInt();   //2
		 
		 int ans=1;
		 
		 while(no>0) //loop start 1 iteration =3>0 true 
			         // 2 iteration =2>0  true
			         // 3 iteratioln =1>0 true
			         // 4 iteration  0>0  false
			 
			 
			 
		 {
			 
			 ans=ans*x; // 2=1*2
			            // 4=2*2
			            // 8=4*2
			 
			 
			 
			 no=no-1;  //2=3-1
			           //1=2-1
			           //0=1-1
			 
			 
		 }
		 
		 
		 System.out.println("power is "+ans);
		 
		 
		 


	}

}