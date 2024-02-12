package com.interviewquestion;

public class MinAndMaxNumberInArray {

	public static void main(String[] args) {
		
		int num[]= {500,10,20,110,30,40,50,100};
		
		int max=num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]>max) {
				
				max=num[i];
				
				
			}
			
			
		}System.out.println("Maximum Number is: "+max);
		
		
		int min=num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]<min) {
				
				min=num[i];
			}
			
		}System.out.println("Minimum Number is: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
