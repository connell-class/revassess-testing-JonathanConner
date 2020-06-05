package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if(arr!=null) {
			int sum = 0; // set sum to 0
		    for (int val : arr) {
		        //iterrate over the array and add each value to sum
		    	sum += val;
		    }
		    return sum;
		}else {
			return 0;
		}
		
	}
}
