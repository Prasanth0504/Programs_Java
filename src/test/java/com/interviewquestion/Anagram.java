package com.interviewquestion;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "silent";
		String b = "listen";
		char[] achar = a.toCharArray();

		char[] bchar = b.toCharArray();

		for (int i = 0; i < achar.length; i++) {

			for (int j = i + 1; j < achar.length; j++) {

				if (achar[i] > achar[j]) {

					char tem = achar[i];
					achar[i] = achar[j];
					achar[j] = tem;

				}
			}
		}

		for (int i = 0; i < bchar.length; i++) {

			for (int j = i + 1; j < bchar.length; j++) {

				if (bchar[i] > bchar[j]) {

					char tem = bchar[i];
					bchar[i] = bchar[j];
					bchar[j] = tem;

				}
			}
		}

		String astr = Arrays.toString(achar);
		String bstr = Arrays.toString(bchar);
		if (astr.equals(bstr)) {

			System.out.println("True");

		}

	}

}
