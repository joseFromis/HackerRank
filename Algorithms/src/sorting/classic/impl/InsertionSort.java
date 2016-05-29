package sorting.classic.impl;

import sorting.classic.AbstractClassicSort;

public class InsertionSort extends AbstractClassicSort {

	public InsertionSort (int[] array) {
		setArray(array);
	}

	@Override
	public void sort() {
		for (int i = 1; i < array.length; i++) {
			
			for (int j = i; j > 0; j--) {
				
				if (array[j] < array[j-1]) {
					swap (j, j-1);
				}
				
			}
		}
	}

}
