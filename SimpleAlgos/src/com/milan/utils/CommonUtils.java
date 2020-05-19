package com.milan.utils;

public class CommonUtils {
	
	public static void swap(Object array[], int pos1, int pos2) {
	
		Object temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		
	}
	
	public static void swap(int array[], int pos1, int pos2) {
		
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		
	}
	
	public static void swap(long array[], int pos1, int pos2) {
		
		long temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		
	}
	
	public static void swap(float array[], int pos1, int pos2) {
		
		float temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		
	}
	
	public static void swap(double array[], int pos1, int pos2) {
		
		double temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		
	}
}
