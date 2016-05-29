package sorting.classic.impl;

import sorting.classic.AbstractClassicSort;

public class SelectionSort extends AbstractClassicSort {

	public SelectionSort (int[] array) {
		setArray(array);
	}

	@Override
	public void sort() {
		
		for (int i = 0; i < array.length -1; i++) {
			
			int min = i;
			
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[j] < array[min]) {
					min = j;
				}
				
			}
			
			swap(i, min);
			
		}
	}

}
