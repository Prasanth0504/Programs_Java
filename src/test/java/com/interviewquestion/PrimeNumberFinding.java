package com.interviewquestion;

public class PrimeNumberFinding {

	public static void main(String[] args) {

		int num = 35;

		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= 100; i++) {

				if (num % i == 0) {
					count++;
				}

			}
			if (count == 2) {

				System.out.println(num + " is prime number");

			} else {
				System.out.println(num + " is not a prime number");
			}

		} else {

			System.out.println(num + " is not a prime number");

		}

		
		//Method 2
		
		
		for (int i = 1; i <=100; i++) {
			boolean prime=true;
			if (i>1) {
				for (int j =2; j<i; j++) {
					
					if (i%j==0) {
						prime=false;
					}
				}
			}
			else {
				prime=false;
			}
			
			if (prime==true) {
				System.out.print(i+" ");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
