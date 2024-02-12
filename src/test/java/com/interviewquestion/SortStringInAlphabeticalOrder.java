package com.interviewquestion;

public class SortStringInAlphabeticalOrder {

	public static void main(String[] args) {

		String s = "sorting";

		char[] ch = s.toCharArray();
		char tem = ' ';
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					tem = ch[i];
					ch[i] = ch[j];
					ch[j] = tem;

				}

			}

		}
		System.out.println(ch);

	}

}
