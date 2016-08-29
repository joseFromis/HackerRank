package sorting.classic.impl;

import sorting.classic.AbstractClassicSort;

public class SelectionSort extends AbstractClassicSort {

	public SelectionSort (int[] array) {
		setArray(array);
	}

	public void sort1() {
		
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
	
	@Override
	public void sort() {
		
		for (int i = 0; i < array.length -1; i++) {
			
			int max = 0;
			
			for (int j = 1; j < array.length - i; j++) {
				
				if (array[j] > array[max]) {
					max = j;
				}
				
			}
			
			swap(max, array.length - i - 1);
			
		}
	}

}
