package com.interviewquestion;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindNotRepeatedCharacterinString {

	public static void main(String[] args) {
		String input = "AABBCDEC";

		for (int i = 0; i < input.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < input.length(); j++) {

				if (i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				}

			}
			if (unique == true) {

				System.out.println("not repeated character is: " + input.charAt(i));

			}

		}


		
		
		
		

		int num= 224522456;
		
		String valueOf = String.valueOf(num);
		String dup="";
	for (int i = 0; i < valueOf.length(); i++) {
		boolean status=true;
		for (int j =0; j <valueOf.length(); j++) {
			
			if (i!=j&&valueOf.charAt(i)==valueOf.charAt(j)) {
				
				//dup=dup+valueOf.charAt(i);
				status=false;
				break;
			}
			
			
		}
		
		
		if (status==true) {
		
			System.out.println("value: "+valueOf.charAt(i));
		}
		
	}
		
	
	Map<Character,Integer>map=new LinkedHashMap<>();
		int count=0;
		char[] chars = input.toCharArray();
	
		for (char ch : chars) {
			
			if (!map.containsKey(ch)) {
				
				map.put(ch, 1);
				
			}
			else {
				Integer cont=map.get(ch);
				map.put(ch,cont+1);
			}
			
			
			
		}
		System.out.println(map);
		
		
		
		
		
		
	}

}
