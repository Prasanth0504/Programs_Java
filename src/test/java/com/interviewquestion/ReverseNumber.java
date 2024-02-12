package com.interviewquestion;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		
		int a=12345;

		int rev=0;

		System.out.println("Before reversing: "+a);

		while(a>0){
			
		rev=rev*10+a%10; 
		a=a/10;


		}System.out.println("After reversing: "+rev);
		
		
		
		
		//using String buffer
		int b=67890;
		

		StringBuffer b1= new StringBuffer(String.valueOf(b));

		StringBuffer reverse=b1.reverse();

		System.out.println(reverse);
		
		
		
		//Using StringBuilder
		int c=445509;
		StringBuilder str = new StringBuilder();
		str.append(c);
		StringBuilder reve=str.reverse();
System.out.println(reve);
		
	}

}
