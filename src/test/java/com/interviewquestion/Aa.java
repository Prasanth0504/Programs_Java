package com.interviewquestion;

import java.util.Arrays;

public class Aa {

	public static void main(String[] args) {

		
String a="name";
		
		//converting string to chararray
		char[] chararr = a.toCharArray();
		System.out.println(chararr);
		
		//converting any Array to string 
		String string = Arrays.toString(chararr);
		
		System.out.println(string);
		
		//converting number to string
		int numb= 12345;
		String num = String.valueOf(numb);
		System.out.println(num);
		
		
		//converting array to string
		int numeric[]= {1,2,3,4,5};
		
		String string2 = Arrays.toString(numeric);
		
		System.out.println(string2);
		
		
		//Converting array to string[] -  use Split method
		
		
		
	}

}
