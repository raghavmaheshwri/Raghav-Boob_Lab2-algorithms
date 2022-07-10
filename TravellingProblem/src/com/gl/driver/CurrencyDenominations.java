package com.gl.driver;

import java.util.Scanner;

import com.gl.function.MergeSort;
import com.gl.function.NotesCounter;

public class CurrencyDenominations {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final String breakStatement = "---------------------------";
		
		System.out.print("Enter the size of currency denominations = ");
		int noOfDenomination = sc.nextInt();
		int[] denominationArray = new int[noOfDenomination];
		
		for(int index = 0; index < noOfDenomination;) {
			System.out.print("Enter the currency denominations value "+(index+1)+" = ");
			int denomination = sc.nextInt();
			if(denomination!=0) {
			denominationArray[index] = denomination;
			index++;
			}
		}
		
		// Using MergeSort
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(denominationArray, 0, denominationArray.length-1);
		
		/* To Check MergeSort
		 * 
		 * for(int i = 0; i<denominationArray.length;i++) {
			System.out.println(denominationArray[i]);
		} 
		
		*/
		
		System.out.print("Enter the Target Amount = ");
		int target = sc.nextInt();
		System.out.println(breakStatement);
		
		NotesCounter notesCounter = new NotesCounter();
		notesCounter.notescount(denominationArray, target);
	}

}
