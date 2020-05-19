package com.milan.impl;

import com.milan.utils.CommonUtils;

//Input: array of positive integers n >=0
//Output: max product

public class MaxPairWiseProduct {

	
	public static long getMaxPairWiseProduct(long array[]) {
	
		//find the first two max numbers and return their product
		
		int length = array.length;
		int  index = 0;
		for(int i=0; i<length; i++) {
			if(array[i]>array[index]) {
				index = i;
			}
		}
		
		
		CommonUtils.swap(array, index, length-1); // last element has largest
		
		index = 0;
		
		for(int i=0; i<length-1; i++) {
			if(array[i]>array[index]) {
				index = i;		
			}		
		}
		CommonUtils.swap(array, index, length-2); // second last has the second largest
		
		return array[length-1]*array[length-2];
		
		
	}
	
}
