package com.interviewquestion;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
	//Swapping 2 numbers without 3rd variable
		
		int a=10;
		int b=20;
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		System.out.println("A value is: "+a);
		System.out.println("B value is: "+b);
		
		
	//Swapping 2 numbers with 3rd Variable
		
		int c=30;
		int d=40;
		int New=c;
		c=d;
	d=New;
	
		System.out.println("C value is: "+c);
		System.out.println("D value is: "+d);
		
		//Swapping 2 numbers in single variable
		
		
		int e=50;
		int f=100;
		
		//150-100
		f=e+f-(e=f);
		
		System.out.println("F value is:"+f);
		System.out.println("E value is:"+e);
		
		
		
		
		
		
		
		
		
		
	}}
