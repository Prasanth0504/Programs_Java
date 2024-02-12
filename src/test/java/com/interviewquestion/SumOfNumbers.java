package com.interviewquestion;

public class SumOfNumbers {

	public static void main(String[] args) {
		
	
		int num=5505;
		
		int sum=0;
		
		while(num>0) {
			
			sum=sum+num%10;
			num=num/10;
			
			
		}System.out.println(sum);
		
		
		
	}

}
