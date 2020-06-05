package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		String longString = Long.toString(num);
		
		int length = longString.length();
		long cl = 0;
//		long powered = num ^ length;
		for (char c: longString.toCharArray()) {
			cl += c^length;
		}
		
		if(cl == num) {
			return true;
		}else {
			return false;
		}
	}
}
