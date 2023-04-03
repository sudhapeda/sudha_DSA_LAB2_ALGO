package com.greatlearning.client;

import java.util.Scanner;

import com.greatlearning.service.TransactionService;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int n = sc.nextInt();
		
		TransactionService ts = new TransactionService();
		
		int[] inputTransaction = new int[n]; 
		for(int i=0; i<n; i++) {
			sc.nextInt();
		}
		//{100, 200, 300,500,600};
		int target = 1300;
		ts.trasactionTarget(inputTransaction, target);
	}

}
