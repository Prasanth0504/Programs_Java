package com.interviewquestion;

public class CapgeminiSeleniumTesting {

	public static void main(String[] args) {
		
		String cap="Selenium Testing";
		
		String[] split=cap.split(" ");

		String sel=split[0];
		String test=split[1];
		String store="";

		for(int i=0;i<sel.length();i++){

		char charA=sel.charAt(i);

		System.out.print(charA);

		for(int j=i;j<test.length();j++){

		char charB=test.charAt(j);

		System.out.print(charB);
		store=store+charA+charB;
		break;

		}

		}
		
		System.out.println();
		System.out.println(store.substring(0,5));
		
		

	}

}
