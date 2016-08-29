package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort2 {
	
	private static int[] array;
    
    public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		quicksort(0, array.length);
		scanner.close();
	}

	private static void quicksort(int left, int right) {

		if (right - left >= 2) {
	 	   int pivot = partition(left, right);
	 	   quicksort(left, pivot);
	 	   quicksort((pivot + 1), right);
	 	   print(left, right);
		}
	}
	
	private static int partition(int left, int right) {

		int pivot = array[left];
		List<Integer> smallerElements = new ArrayList<Integer>(array.length);
		List<Integer> largerElements = new ArrayList<Integer>(array.length);

		for (int i = left + 1; i < right; ++i) {
			if (array[i] < pivot) {
				smallerElements.add(array[i]);
			} else {
				largerElements.add(array[i]);
			}
		}

		for (int i = 0; i < smallerElements.size(); ++i) {
			array[left + i] = smallerElements.get(i);
		}

		array[left + smallerElements.size()] = pivot;

		for (int i = 0; i < largerElements.size(); ++i) {
			array[left + smallerElements.size() + 1 + i] = largerElements.get(i);
		}

		return left + smallerElements.size();
	}

	private static void print(int left, int right) {
		for (int i = left; i < right; ++i) {
			System.out.print(Integer.toString(array[i]) + " ");
		}
		System.out.println("");
	}
}
