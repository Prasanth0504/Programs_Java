package com.interviewquestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EY_India_PrintNonDuplicateValue {

	public static void main(String[] args) {
		
	String string="Java Programming Prasanna is expert in Java expert web and expert in API";
		
		String arr[]= string.split(" ");
		String value="";
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean status=false;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i].equals(arr[j])) {
					value=value+arr[i];
					status=true;
										
				}
				
				
				
			}
			
			if (status==false) {
				System.out.print(arr[i]+" ");
				
			}
			
			
		}
		System.out.println();
		System.out.println("***************************************************************");
		
		
		Set<String> set=new LinkedHashSet<>();
		for (String string2 : arr) {
			
			if (set.add(string2)==false) {
				System.out.println("duplicate string: "+string2);
			}
			
			
		}
		
		System.out.println("nonduplicate values: "+set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
