package sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quicksort1 {
	
	private static int[] array;
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		quicksort(0, 0, size -1);
		
		scanner.close();
	}

	public static void quicksort(int low, int pivot, int high) {
		List<Integer> left = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        
        for (int i = 0; i <= high; i++) {
            if (array[i] < array[pivot]) {
                left.add(array[i]);    
            } else if (array[i] > array[pivot]) {
                right.add(array[i]);
            } else {
                equal.add(array[i]);
            }
        }
		
        printList(left);
        printList(equal);
        printList(right);
        
	}
	
	private static void printList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}
}
