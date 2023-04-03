package com.greatlearning.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyService {	

	public void denominatorService(int[] denominators, int amount) {
		boolean flag = true;
		List<String> result = new ArrayList<>();
		 while(flag) {
			 for(int i=0; i<denominators.length; i++) {
				 int numberOfDenominator = 0;
					while (amount >= denominators[i]) {
						amount = amount - denominators[i];
						numberOfDenominator++;
					}
					if (numberOfDenominator != 0) {
						result
						.add("Number of denominators :: " + numberOfDenominator + " currency:: " + denominators[i]);
					}

				}
				flag = false;
			}

			System.out.println(result);
	}

	
}
