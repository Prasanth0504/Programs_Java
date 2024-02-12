package com.interviewquestion;

import java.util.Arrays;

public class SortElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,3,2,4,1};
		
	
		
		int s=a.length;
		
		for (int i = 0; i <s-1; i++) {
			
			for (int j = 0; j < s-1; j++) {
				
				if (a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
