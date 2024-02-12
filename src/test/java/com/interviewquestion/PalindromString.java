package com.interviewquestion;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you String");
		String string = sc.next();
		String org_string=string;
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			
			rev=rev+string.charAt(i);
			
			
			
		}if (org_string.equals(rev)) {
			
			System.out.println(org_string+" is palindrom");
		} else {
			System.out.println(org_string+" is not palindrom");
		}
		
		
		
		
		

	}

}
