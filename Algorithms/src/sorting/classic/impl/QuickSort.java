package sorting.classic.impl;

import sorting.classic.AbstractClassicSort;

public class QuickSort extends AbstractClassicSort {

	public QuickSort(int[] array) {
		setArray(array);
	}

	@Override
	public void sort() {
		merge(0, array.length - 1);
	}
	
	private void merge (int low, int high) {
		
		int pivot = array[low + (high - low) / 2];
		int i = low;
		int j = high;
		
		while (i <= j) {
			
			while (array[i] < pivot) {
				i++;
			}
			
			while (pivot < array[j]) {
				j--;
			}
			
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
			
			if (low < j) {
				merge(low, j);
			}
			
			if (high > i) {
				merge(i, high);
			}
		}
	}

}
