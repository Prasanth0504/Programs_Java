package com.interviewquestion;

public class LargestNumberFrom3Numbers {

	public static void main(String[] args) {
		
		int a=100;
		int b=500;
		int c=300;

if ( a>b&&a>c) {
	System.out.println("large is A" +a );
}
else if (b>a&&b>c) {
	System.out.println("large is b" +b);
}
else 
	System.out.println("large is c"+c);


int max = Math.max(a, b);
max=Math.max(max,c);
System.out.println("Big number is: "+max);










		int perisu= a>b?a:b;
				perisu = c>(perisu)?c:perisu;
		System.out.println("large is"+perisu);
	
	
	for (int i = 0; i < args.length; i++) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
