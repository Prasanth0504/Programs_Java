package com.interviewquestion;

public class PatternPrograms {

	public static void main(String[] args) {
		
		
		int row=5;
		
		for (int i = 0; i <=row; i++) {
			
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
				
				
			}
			
			System.out.println("");
		}
		
		
		
		
		for (int i = 1; i <=row; i++) {
			
			for (int s = 1; s<=row-i; s++) {
				
				System.out.print(" ");
							
				
			}
			
			for (int j = 1; j <=i*2-1; j++) {
				
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
