package com.interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="Malayalam";
		
		String rev="";
		System.out.println("Before Reversing: "+a);
		for(int i=a.length()-1;i>=0;i--){
		rev=rev+a.charAt(i);
		}System.out.println("After Reversing: "+rev);
				
		
		//Using String buffer
		
		
		StringBuffer string=new StringBuffer(a);
		System.out.println(string.reverse());
		
		
		StringBuilder build = new StringBuilder();
		build.append(a);
		System.out.println(build.reverse());

		
		//using Array
		
		String s[]= {"Madam"};
		String revq ="";
		for (String string2 : s) {
			
			for (int i =string2.length()-1; i>=0; i--) {
				
				revq=revq+string2.charAt(i);
				
			}
			
		}System.out.println(revq);
		
		

		
		
	}

}
