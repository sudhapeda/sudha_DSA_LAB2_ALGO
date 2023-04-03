package com.greatlearning.service;


public class TransactionService {
	public static void trasactionTarget(int[] array, int target) {
		
		int totalCount = 0;
		boolean flag = false;
		for(int i =0; i<array.length; i++) {
			totalCount = (totalCount + array[i]);
			
			if(totalCount > target) {
				System.out.println("Target value achieve after " + (i+1) + " transaction");
				flag = true;	
				break;
			}
		}
		if(!flag)
			System.out.println("Target value is not achieve after " +(array.length+1)+ "transacatioons");
	}
}