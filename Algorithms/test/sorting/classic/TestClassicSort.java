package sorting.classic;

import org.junit.Assert;
import org.junit.Test;

import sorting.classic.impl.BubbleSort;
import sorting.classic.impl.InsertionSort;
import sorting.classic.impl.MergeSort;
import sorting.classic.impl.QuickSort;
import sorting.classic.impl.SelectionSort;


public class TestClassicSort {
	
	int[] unsortedArray = {2, -1, 4, 5, 10, 0, -5, 8};
	int[] sortedArrray = {-5, -1, 0, 2, 4, 5, 8, 10};
	
	@Test
	public void testBubbleSort() {
		BubbleSort bubbleSort = new BubbleSort(unsortedArray);
		bubbleSort.sort();
		Assert.assertArrayEquals(sortedArrray, bubbleSort.getArray());
	}
	
	@Test
	public void testInsertionSort() {
		InsertionSort insertionSort = new InsertionSort(unsortedArray);
		insertionSort.sort();
		Assert.assertArrayEquals(sortedArrray, insertionSort.getArray());
	}
	
	@Test
	public void testSelectionSort() {
		SelectionSort selectionSort = new SelectionSort(unsortedArray);
		selectionSort.sort();
		Assert.assertArrayEquals(sortedArrray, selectionSort.getArray());
	}
	
	@Test
	public void testMergeSort() {
		MergeSort mergeSort = new MergeSort(unsortedArray);
		mergeSort.sort();
		Assert.assertArrayEquals(sortedArrray, mergeSort.getArray());
	}
	
	@Test
	public void testQuickSort() {
		QuickSort quickSort = new QuickSort(unsortedArray);
		quickSort.sort();
		Assert.assertArrayEquals(sortedArrray, quickSort.getArray());
	}

}
