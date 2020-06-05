package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		//Check for null
		if(arr!=null) {
			int sum = 0; // set sum to 0
		    //iterrate over the array and add each value to sum
			for (int val : arr) {
		    	sum += val;
		    }
		    return sum; 

		}else {
			return 0; //default return val of  0
		}
		
	}
}
