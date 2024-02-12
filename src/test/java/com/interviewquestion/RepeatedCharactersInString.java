package com.interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharactersInString {

	public static void main(String[] args) {
		
		
		
String s="This is Java program and API and This is selenium";
		
		
		
		String[] split = s.split(" ");
		
		Set<String> set = new HashSet<>();
		
		for (String ch :split) {
			
			if(set.add(ch)==false) {
				
				System.out.println(ch);	
			}
			
			
		}
		
		String a="This is a Java Program";
		
		String dup="";
		String d="";
		for (int i = 0; i < a.length(); i++) {
			
			
			for (int j = i+1; j <a.length(); j++) {
				
				
				if(a.charAt(i)==a.charAt(j)) {
					
					String ss=Character.toString(a.charAt(i));
			
					if (!dup.contains(ss)) {
						dup=dup+" "+a.charAt(i);
						
					}
					
				}	
			
			}
		}
		System.out.println(dup);
		
		Set<Character> set1=new HashSet<>();
		char[] charArray = a.toCharArray();
		for (char c : charArray) {
			
			if(set1.add(c)==false) {
				
				System.out.println(c);
				
			}
		}
		
		
		//Repeated words in string and count--Agilisium
	
		String word="This this is is a automation test";
		
		String[] words=word.split(" ");
		String repeated="";
		int count=0;
		
		for (int i = 0; i < words.length; i++) {
			
			for (int j = i+1; j < words.length; j++) {
				
				if (words[i].equalsIgnoreCase(words[j])) {
					
					repeated=words[i];
					System.out.println("Repeated String is: "+repeated);
					count++;
				}
				
				
			}
			
			
		}System.out.println("Repeated word count is: "+count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
