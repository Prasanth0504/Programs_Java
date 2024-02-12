package com.interviewquestion;

import java.util.Arrays;

public class LongestCommonprefix {

	public static void main(String[] args) {
	
		
		String word[]= {"flower","flight","flow"};
		
	Arrays.sort(word);
		System.out.println(Arrays.toString(word));
		String s1=word[0];
		
		String s2=word[word.length-1];
		
		String op="";
		
		
		for (int i = 0; i <s1.length(); i++) {
			
			if (s1.charAt(i)==s2.charAt(i)) {
				op=op+s1.charAt(i);
			}
			else {
				break;
			}
			
			
		}
		
		System.out.println(op);
			
		
		
	}

}
