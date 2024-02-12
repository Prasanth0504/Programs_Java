package com.interviewquestion;

public class EvenOrOddNumberFromArray {

	public static void main(String[] args) {
		
		int num[]= {3,2,4,5,6,2};
		int even=0;
		int odd=0;
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]%2==0) {
				even++;
				int Evennumber=num[i];
				
				System.out.println("Even numbers:"+Evennumber);
				
			}
			else {
				odd++;
				System.out.println("Odd numbers:"+num[i]);
			}
			
			
		}System.out.println("Even counts are:"+even);
		System.out.println("Odd number counts are:"+odd);
		

	}

}
