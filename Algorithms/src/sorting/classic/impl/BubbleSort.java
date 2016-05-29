package sorting.classic.impl;

import sorting.classic.AbstractClassicSort;

public class BubbleSort extends AbstractClassicSort {

	public BubbleSort (int[] array) {
		setArray(array);
	}

	@Override
	public void sort() {
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 1; j < array.length - i; j++) {
				
				if (array[j-1] > array[j] ) {
					swap(j, j-1);
				}
			}
			
		}
	}
}

