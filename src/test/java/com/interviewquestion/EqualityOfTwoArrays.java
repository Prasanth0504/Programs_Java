package com.interviewquestion;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		int first[]= {1,2,3,6,4,5};
		int second[]= {1,2,3,5,4,5};
	
/*	boolean equals = Arrays.equals(first, second);
		
	if (equals==true) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
		*/
		
	
	//using for loop
	
	
	boolean status=true;
	
	if (first.length==second.length) {
		
		for (int i = 0; i < second.length; i++) {
			
			if (first[i]!=second[i]) {
				
				status=false;
			}
			
		}
		
		
	}

	else {
		status=false;
	}
	
	
	if (status==true) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("Arrays not equal");
		
		
	}
	
	
	
	
	
	
	
	}

}
