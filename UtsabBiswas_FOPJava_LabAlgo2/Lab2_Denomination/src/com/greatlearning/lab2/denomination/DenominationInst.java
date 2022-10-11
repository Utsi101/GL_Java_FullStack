package com.greatlearning.lab2.denomination;

import java.util.Scanner;

public class DenominationInst {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denomination: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the value of the denomination: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt(); }
		
		System.out.println("Enter the amount you need to pay: ");
		int target = sc.nextInt();
		
		DenominationSort ds = new DenominationSort();
		ds.mergeSort(arr,0,size-1);
		System.out.println("Sorted Array: ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+", ");
		}
		
		DenominationCalc dc = new DenominationCalc();
		dc.calcDenomination(arr, target, size);
		sc.close();

	}


}
