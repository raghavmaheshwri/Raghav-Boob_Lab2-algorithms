package com.gl.function;

public class MergeSort {

	public void merge(int[] array, int left, int mid, int right) {
		int sizeOfLeftPortion;
		int sizeOfRightPortion;
		sizeOfLeftPortion = mid - left + 1;
		sizeOfRightPortion = right - mid;

		int leftArray[] = new int[sizeOfLeftPortion];
		int rightArray[] = new int[sizeOfRightPortion];

		for (int index = 0; index < sizeOfLeftPortion; index++) {
			leftArray[index] = array[left + index];
		}

		for (int index = 0; index < sizeOfRightPortion; index++) {
			rightArray[index] = array[mid + 1 + index];
		}

		int i = 0, j = 0;
		int k = left;

		while (i < sizeOfLeftPortion && j < sizeOfRightPortion) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < sizeOfLeftPortion) {
			array[k] = leftArray[i];
			k++;
			i++;
		}

		while (j < sizeOfRightPortion) {
			array[k] = rightArray[j];
			k++;
			j++;
		}

	}

	public void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			merge(array, left, mid, right);
		}
	}
}
