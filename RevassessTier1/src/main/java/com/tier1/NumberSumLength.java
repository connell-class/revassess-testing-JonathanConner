package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		String longString = Long.toString(num); //get a string to calculate the length
		
		int length = longString.length();  //the numbers string length

		long sum = 0L; // this will hold the sum of powers

		//for each char in the string treat as a integer
		//raise it to the power of length
		//the result to the sum
		for (char c: longString.toCharArray()) {
			long n = Long.parseLong(String.valueOf(c));
			sum += Math.pow(n, length);
		}
		
		if(sum == num) {
			return true;
		}else {
			return false;
		}
	}
}
