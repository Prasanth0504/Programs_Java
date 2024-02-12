package com.interviewquestion;

public class VowelsOccuranceCount {

	public static void main(String[] args) {

		String vow = "Education";

		int countofA = 0, countofE=0,countofI=0,countofO=0,countofU=0; 
		char lc = ' ';
		for (int i = 0; i < vow.length(); i++) {

			char ch = vow.charAt(i);
			lc = Character.toLowerCase(ch);
			switch (lc) {
			case 'a':
				countofA++;

				break;
			case 'e':
				countofE++;

				break;
			case 'i':
				countofI++;

				break;
			case 'o':
				countofO++;

				break;
			case 'u':
				countofU++;
				
				break;

			}

		}
		System.out.println("number of A present is: "+countofA);
		System.out.println("number of E present is: "+countofE);
		System.out.println("number of I present is: "+countofI);
		System.out.println("number of O present is: "+countofO);
		System.out.println("number of U present is: "+countofU);
	
	
	
	}

}
