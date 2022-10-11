package com.greatlearning.lab2.denomination;

public class DenominationCalc {
	
public void calcDenomination(int []arr, int sum, int size) {
		
		int[] counter = new int[size];
		for(int i=size-1;i>=0;i--) {
			if(sum >= arr[i]) {
				counter[i] = sum / arr[i];
				sum = sum%arr[i];
			}
		}
		
		System.out.println("Currency count - >");
		for(int i=size-1; i>=0; i--) {
			if(counter[i] != 0) {
				System.out.println(arr[i] + " : " + counter[i]);
			}
		}
	}

}
