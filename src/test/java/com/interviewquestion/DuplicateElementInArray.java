package com.interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int num[]= {5,3,2,1,2,4,4};
		Set<Integer> dupl=new HashSet<Integer>();
		for (int value : num) {
			
			if(dupl.add(value)==false) {
				
				System.out.println("Duplicate elements are: "+value);
			}
			
			
			
		}System.out.println("Without duplicate values: "+dupl);
		
		String arr[]= {"Java","Sql","Python","Js","Java","Sql"};
		
		String rest="";
		for (int i = 0; i < arr.length; i++) {
			
			boolean status=false;
			for (int j = i+1; j < arr.length; j++) {
				
				if (!arr[i].equals(arr[j])) {
				
					status=true;
					
				}
				else {
					rest=rest+arr[i]+" ";
				}
				
			}
			
			
		}
		System.out.println(rest);
		
		
	
		
		

		int find[]= {2,3,4,3,5,5,6,6,2};
		int dups=0;
		
		for (int i = 0; i < find.length; i++) {
			
			for (int j = i+1; j < find.length; j++) {
				
				if (find[i]==find[j]) {
					
					dups=find[i];
					System.out.println("Duplicate values are:"+dups);
				}
				
				
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
