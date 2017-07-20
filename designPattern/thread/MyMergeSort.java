package designPattern.thread;

import java.util.Arrays;

public class MyMergeSort {
	int array[];
	int tempArray[];
	int length;

	public void sort(int arr[]) {
		this.array = arr;
		length = arr.length;
		mergeSort(0, length - 1);

	}

	private void mergeSort(int initialIndex, int finalIndex) {
		if (initialIndex < finalIndex) {
			int middleIndex = initialIndex + (finalIndex - initialIndex) / 2;
			mergeSort(initialIndex, middleIndex);
			mergeSort(middleIndex+1,finalIndex);
			mergeParts(initialIndex, middleIndex, finalIndex);

		}

	}

	private void mergeParts(int initialIndex, int middleIndex, int finalIndex) {
		tempArray = Arrays.copyOf(array, array.length);

		int i = initialIndex;
		int j = middleIndex + 1;
		int k = initialIndex;

		while (i <= middleIndex && j <= finalIndex) {
			if (tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			} else {
				array[k] = tempArray[j];
				j++;
			}
			k++;

		}

		while (i <= middleIndex) {
			array[k] = tempArray[i];
			k++;
			i++;
		}

	}

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MyMergeSort mms = new MyMergeSort();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
