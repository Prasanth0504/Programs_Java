package com.interviewquestion;

import java.util.Arrays;

public class ReplaceRepeatedCharsWithNumbers {

	public static void main(String[] args) {
		
		String input="Programming";
		
		char replace='l';
		
		if(input.indexOf(replace)==-1) {
			
			System.out.println("Repeated character not found");
			
		}
		
		
		int cnt=1;
		
		char[] charArray = input.toCharArray();
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]==replace) {
				
				charArray[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		
			
		}
		System.out.println(Arrays.toString(charArray));

	}

}
