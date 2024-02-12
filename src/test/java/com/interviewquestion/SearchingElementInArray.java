package com.interviewquestion;

public class SearchingElementInArray {

	public static void main(String[] args) {
		
		int num[]= {10,20,30,50,40,60};
		
		int search=20;
		
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]==search) {
				
				System.out.println("Searching number Index is: "+i);
			}
			
			
			
		}
		
		

	}

}
