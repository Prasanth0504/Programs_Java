package com.interviewquestion;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=6;
		
		long factorial=1;
		
		
		for (int i = num; i >=1; i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
