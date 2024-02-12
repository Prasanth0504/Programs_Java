package com.interviewquestion;

public class EqualsAnddoubleEqualOperator {

	public static void main(String[] args) {
		
		
		String s1="hello";
		String s2="hello";
		
		
		System.out.println(s1.equals(s2));
		
		
		String n1=new String("hello");
		String n2=new String("hello");
		
		System.out.println(s1.equals(n1));
		
		System.out.println(s1==n1);
		
		System.out.println(n1==n2);
		
		

	}

}
