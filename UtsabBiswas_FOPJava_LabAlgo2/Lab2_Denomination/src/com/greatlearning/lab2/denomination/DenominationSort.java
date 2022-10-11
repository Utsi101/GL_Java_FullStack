package com.greatlearning.lab2.denomination;

public class DenominationSort {
	
	public void merge(int[] arr, int start, int mid, int end) {

	    int size1 = mid - start + 1;
	    int size2 = end - mid;

	    int leftArray[] = new int[size1];
	    int rightArray[] = new int[size2];

	    for (int i = 0; i < size1; i++)
	    	leftArray[i] = arr[start + i];
	    for (int j = 0; j < size2; j++)
	    	rightArray[j] = arr[mid + 1 + j];

	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = start;

	    while (i < size1 && j < size2) {
	      if (leftArray[i] <= rightArray[j]) {
	    	  arr[k] = leftArray[i];
	        i++;
	      } else {
	    	  arr[k] = rightArray[j];
	        j++;
	      }
	      k++;
	    }

	    while (i < size1) {
	    	arr[k] = leftArray[i];
	      i++;
	      k++;
	    }

	    while (j < size2) {
	    	arr[k] = rightArray[j];
	      j++;
	      k++;
	    }
	  }

	  public void mergeSort(int[] arr, int start, int end) {
	    if (start < end) {
	      int mid = (start + end) / 2;

	      mergeSort(arr, start, mid);
	      mergeSort(arr, mid + 1, end);

	      merge(arr, start, mid, end);
	    }
	  }


}
