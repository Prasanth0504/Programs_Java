package com.interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondBigNumberFinding {

	public static void main(String[] args) {
		
		int num[]= {20,30,40,100,50,60,90,5};
		Arrays.sort(num);
		
		int firstbig=0;
		int secondbig=0;
		
	for(int i=0;i<num.length;i++) {
		
		if (num[i]>firstbig) {
			secondbig=firstbig;
			firstbig=num[i];
			
		}
		
		
	}
	
	System.out.println(firstbig);
System.out.println(secondbig);
	
int numb[] = {20, 30, 40, 100, 50, 60, 90, 5,500,700};

// Create a List<Integer> from int[]
   List<Integer> asList = new ArrayList<>();
   for (int value : numb) {
       asList.add(value);
   }

   Collections.sort(asList);
   
   
   
   System.out.println("First big number is: " +asList.get(asList.size()-1));
   System.out.println("Second big number is: " +asList.get(asList.size()-2));





	//Second alone

	int numbe[]= {5,3,9,7,6};
	
	int firstlarge=0;
	int secondlarge=0;
	
	for (int i = 0; i < numbe.length; i++) {
		
		if(numbe[i]>firstlarge) {
			
			firstlarge=secondlarge;
			secondlarge=numbe[i];
			
			
		}
		
		
		
		
		
	}
System.out.println("Second large number is: "+secondlarge);
	
System.out.println("Second large number is: "+firstlarge);
	}

}
