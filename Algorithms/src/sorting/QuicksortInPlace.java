package sorting;

import java.util.Scanner;

public class QuicksortInPlace {
	
	private static int[] array;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		quicksort();
		scanner.close();
	}
	
	private static void quicksort() {
		quicksort(0, array.length - 1);
	}
	
	private static void quicksort(int from, int to) {

		if ((to - from) >= 1) {
			int pivotPosition = partition(from, to);
			print();
			// Sort the left part of the array
			quicksort(from, pivotPosition - 1);
			// Sort the left part of the array
			quicksort(pivotPosition + 1, to);
		}
		
	}
	
	private static int partition(int from, int to) {
	
		int pivot = array[to];
		int wallIndex = from;
	
		for (int currentIndex = from; currentIndex < to; ++currentIndex) {
			
			if (array[currentIndex] < pivot) {
				swap(array, wallIndex, currentIndex);
				++wallIndex;
			}
			
		}

		swap(array, wallIndex, to);

		return wallIndex;
	}
	
	private static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}

	private static void print() {
		
		for (int element : array) {
			System.out.print(Integer.toString(element) + " ");
		}
		
		System.out.println("");
	}

}
