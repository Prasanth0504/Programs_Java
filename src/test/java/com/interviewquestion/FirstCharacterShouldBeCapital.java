package com.interviewquestion;

public class FirstCharacterShouldBeCapital {

	public static void main(String[] args) {
		
		String word="java is a known language";
		String words="";
		String[] split=word.split(" ");
		
		for (String strings : split) {
			char charAt = strings.charAt(0);
			
			char upper = Character.toUpperCase(charAt);
			
			words=strings.substring(1);
			
			String op=upper+words+" ";
			System.out.print(op);
		}
			
		
		
		
	}

}
