package com.interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class ReturnOddNumber {

	public static List<Integer> oddNumber() {
		List<Integer> li=new ArrayList<>();
		
		for (int i = 1; i <=20; i+=2) {
			li.add(i);
		}
		
		return li;
	}
	
	
	
	public static void main(String[] args) {

		List<Integer> oddNumber =oddNumber();
		
		System.out.println(oddNumber);
		
		
		
		
	}

}
