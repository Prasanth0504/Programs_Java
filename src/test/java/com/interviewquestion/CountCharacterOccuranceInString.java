package com.interviewquestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterOccuranceInString {

	public static void main(String[] args) {

		// counting particular character
		String str = "Java Programming language";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			String s = Character.toString(str.charAt(i));

			if (s.contains("a")) {
				count++;
			}

		}
		System.out.println("Number of A count is: " + count);
		
		

		// counting all character

		Map<Character, Integer> map = new LinkedHashMap<>();

		char[] chars = str.toCharArray();

		for (char ch : chars) {

			if (!map.containsKey(ch)) {

				map.put(ch, 1);

			} else {

				int cnt = map.get(ch);

				map.put(ch, cnt + 1);
			}

		}

		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
