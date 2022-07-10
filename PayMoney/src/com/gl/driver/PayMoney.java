package com.gl.driver;

import java.util.Scanner;

public class PayMoney {
	private final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		final String breakStatement = "---------------------------";
		
		// Size of Transaction Array
		System.out.print("Enter the size of transaction array : ");
		int size = sc.nextInt();
        
		System.out.println(breakStatement);
        
        
		// Initializing Transaction Array
		int[] transactionArray = new int[size];

		// Taking Transaction Values
		for (int index = 0; index < size;) {

			System.out.print("Enter the Transation Value " + (index + 1)+" : ");
			int transaction = sc.nextInt();
			if (transaction > 0) {
				transactionArray[index] = transaction;
				index++;
			} else {
				System.out.println("Transaction Value Can't be Zero | Please Enter Value Again !!");
			}
		}
		
		System.out.println(breakStatement);
		
		//Taking No. of Targets
		System.out.print("Enter the total no of targets that needs to be achieved: ");
		int noOfTargets = sc.nextInt();
		System.out.println(breakStatement);
		printNumberofTransactions(transactionArray, noOfTargets);
		sc.close();

	}

	//
	private static void printNumberofTransactions(int[] transactionArray, int noOfTargets) {
		int index = 1;
		while (noOfTargets > 0) {
			System.out.print("Enter the value of target " + index+" :");
			int target = sc.nextInt();
			int transactionCounts = getNumberofTransation(transactionArray, target);

			if (transactionCounts == -1) {
				System.out.println("Target Not Achived");
			} else {
				System.out.println("Target achieved after " + transactionCounts + " transactions \n");
			}
			index++;

			noOfTargets--;
		}

	}
	
	
	// Checking Target Value Achieved 
	private static int getNumberofTransation(int[] transactionArray, int target) {
		int transactionCount = 0;
		int sum = 0;
		do {
			sum = sum + transactionArray[transactionCount];
			transactionCount++;
		} while (sum < target && transactionCount < transactionArray.length);

		if (sum < target) {
			return -1;
		} else {
			return transactionCount;
		}
	}
}
