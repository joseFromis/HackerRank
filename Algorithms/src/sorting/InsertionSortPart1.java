package sorting;

import java.util.Scanner;

public class InsertionSortPart1 {
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		
		insertIntoSorted(array);
		
		scanner.close();
	}

	public static void insertIntoSorted(int[] ar) {
		
		int size = ar.length;
		int value = ar[size - 1];
		int i;
		
		for (i = size - 2; i > -1 && ar[i] > value; i--) {
			ar[i + 1] = ar[i];
            printArray(ar);
		}
		
		ar[i + 1] = value;
		printArray(ar);
	}
	
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
	        System.out.println("");
	   	}
	
}
