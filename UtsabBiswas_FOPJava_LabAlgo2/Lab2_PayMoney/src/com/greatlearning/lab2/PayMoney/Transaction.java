package com.greatlearning.lab2.PayMoney;

import java.util.Scanner;

public class Transaction {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of the transactions:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the values of the transactions:");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets needs to be achieved:");
		int targetNo = sc.nextInt();
		
		while(targetNo != 0) {
			
			System.out.println("Enter the targets :");
			int [] target = new int[targetNo];
			for(int i=0; i<=targetNo-1; i++) {
				target[i]=sc.nextInt();}
			
			for(int j=0; j<= targetNo-1; j++) {
				int flag = 0;
				for(int i=0;i<size;i++) {
					int sum = 0;
					sum += arr[i];
					if(sum>=target[j]) {
						System.out.println("The target "+target[j]+" is achieved in "+(i+1)+" transcations.");
						flag =1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("The target "+target[j]+" is not achieved.");
				}
			}
			break;
		}
		sc.close();
	}

}
