package com.interviewquestion;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberGenerate {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int nextInt = random.nextInt(3000);
		System.out.println(nextInt);

		
		String randomAlphanumeric = RandomStringUtils.randomNumeric(10);
		
		System.out.println(randomAlphanumeric);
		
		String randoms = RandomStringUtils.randomAlphanumeric(5);
		System.out.println(randoms);
	}

}
