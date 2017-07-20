package designPattern.thread;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyQuickSort {
	//LinkedList<E>
	

	
	public int array[];
	int length;

	public void sort(int ar[]) {
		if (ar == null || ar.length == 0) {
			return;
		}
		this.array = ar;
		this.length = ar.length;
		quicksort(0, length - 1);
System.out.println();
	}

	private void quicksort(int firstIndex, int lastIndex) {
		int i = firstIndex;
		int j = lastIndex;
		int pivot = array[firstIndex + (lastIndex - firstIndex) / 2];
		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNaumber(i, j);
				i++;
				j--;

			}

		}
		if(firstIndex<j){
			quicksort(firstIndex,j);
		}
		if(lastIndex>i){
			quicksort(i,lastIndex);
		}

	}

	private void exchangeNaumber(int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		Integer arr1[] = new Integer[]{};
		
		MyQuickSort myQuickSort = new MyQuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		myQuickSort.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
	}

}
