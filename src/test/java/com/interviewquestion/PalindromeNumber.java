package com.interviewquestion;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Checking PalindromeNumber number

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int org_num=num;

		int rev=0;

		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;	
		}
		if(org_num==rev){

			
		System.out.println(org_num+" is a Palindrom number");
		}

		else{
		System.out.println("It is not Palindrom");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
