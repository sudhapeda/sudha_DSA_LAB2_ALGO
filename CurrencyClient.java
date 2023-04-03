package com.greatlearning.client;

import com.greatlearning.service.CurrencyService;
import com.greatlearning.service.DenominatorsBubbleSort;

public class CurrencyClient {

	public static void main(String[] args) {
		CurrencyService service = new CurrencyService();
		DenominatorsBubbleSort dbs = new DenominatorsBubbleSort();
		
		int[] denominators = new int[] {50, 20, 100, 500, 200, 10};
		
		dbs.sort(denominators);
		System.out.println("denominators array after sort");
		for(int i=0; i<denominators.length; i++) {
			System.out.println(denominators[i]+ " ");
		}
		service.denominatorService(denominators, 3650);
	}

}
