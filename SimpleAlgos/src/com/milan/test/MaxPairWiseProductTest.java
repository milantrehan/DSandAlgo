package com.milan.test;

import com.milan.impl.MaxPairWiseProduct;

public class MaxPairWiseProductTest {
	
	public static void main(String [] args) {
			
		stressTest(1000, 200000);
	}
	
	public static void stressTest(int maxNumberOfElements, long maxValue) {
		
	  int randomLength;
	  
	  while(true) {
		 randomLength = 2 + (int)(Math.random()*(maxNumberOfElements-2));
		System.out.println("Random length: "+ randomLength);
		long[] array = new long[randomLength];
		
		long randomNumber;
		for(int i =0; i < randomLength; i++ ) {
			
			randomNumber = Math.round( 10+  Math.random()*maxValue);
			array[i] = randomNumber;
		}
		
		System.out.print("Array is: ");
		
		
		for (int i = 0;i< randomLength; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		long result1 = getMaxPairwiseProductNaive(array);
		long result2 = MaxPairWiseProduct.getMaxPairWiseProduct(array);
		
		
		
		System.out.println("Result1: "+ result1);
		System.out.println("Result2 "+ result2);
		
		if( result1 == result2) {
			System.out.println("OK");
		}
		else {
			System.out.println("TEST FAILED");
		}
		System.out.println();
	  }	
	}
	public static long getMaxPairwiseProductNaive(long array[]) {
		
		int length = array.length;
		
		long product = 0;
		for(int i = 0; i<length; i ++) {
			
			for(int j = i+1; j<length; j++) {
				product = Math.max(product, array[i]*array[j]);
			}
		}
		return product;
	}
 
}


