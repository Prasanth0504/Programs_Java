package com.interviewquestion;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		
		int num[]= {1,2,3,4,5,6};
		int sum1=0;
		
		for (int i = 0; i < num.length; i++) {
			
			sum1=sum1+num[i];
			
		}
		int sum2=0;
		
		for (int i= 0; i <=7; i++) {
			
			sum2=sum2+i;
		}
		
		System.out.println(sum2-(sum1));
		
		
		
		

		//Missing number in array
		
		int missing[]={1,10,20,30,40,60};
		
		int copy[]= new int[61];
		
		for (int val : missing) {
			
			copy[val]=1;
		}
		
		for (int i = 1; i < copy.length; i++) {
			
			if (copy[i]==0) {
				System.out.println(i+" ");
			}
			
		}

		
		
		int number[]= {10,20,30,40,50,60,80};
		
		int sums1=0;
		int sums2=0;
		
		for (int i = 0; i < number.length; i++) {
			
			sums1=sums1+number[i];
			
			
		}
		
		for (int i = 10; i <=80; i+=10) {
			
			sums2=sums2+i;
			
			
			
		}
		
		System.out.println(sums2-(sums1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
