package com.greatlearning.service;

public class DenominatorsBubbleSort {

	public void sort(int[] denominators) {
		
		int temp = 0;
		for(int i =0; i<denominators.length; i++) {
			for(int j=0;j<denominators.length-i-1;j++)
            {
                if(denominators[j]<denominators[j+1])
                {
                    temp = denominators[j];
                    denominators[j] = denominators[j+1];
                    denominators[j+1] = temp;
                }
			}
			
		}
		
	}

}
