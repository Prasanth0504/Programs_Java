package com.interviewquestion;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13
		
		int n1=0;
		int n2=1;
			int sum=0;	
			
			System.out.print(n1+" "+n2);
		while(sum<21) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}System.out.println();
	
		System.out.println("***********");
		
		
		int num=0;
		int num1=1;
		int sum1=0;
		
		System.out.print(num+" "+num1);
		for (int i = 2; i <=8; i++) {
			
			sum1=num+num1;
			System.out.print(" "+sum1);
			num=num1;
			num1=sum1;
			
			
		}

	}

}
