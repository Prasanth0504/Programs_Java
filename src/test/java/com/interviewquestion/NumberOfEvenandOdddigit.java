package com.interviewquestion;

public class NumberOfEvenandOdddigit {

	public static void main(String[] args) {
		
		int num=13252532;
		
		int Evencount=0;
		int Oddcount=0;
		int last=0;
		
		while(num>0) {
			
			
			int rem=num%10;
			
			if (rem%2==0) {
				Evencount++;
				
			}
			if (rem%2!=0) {
				Oddcount++;
				
			}
			num=num/10;
		}System.out.println("Even number is: "+Evencount);
		System.out.println("Odd number is: "+Oddcount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
