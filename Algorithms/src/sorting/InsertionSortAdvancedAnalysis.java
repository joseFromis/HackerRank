package sorting;

import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {
	
	// Binary indexed tree
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
        
        for (int i = 0; i < test; i++) {
            int size = scanner.nextInt();
		
		      int[] array = new int[size];
		
		      for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
		      }
		
		      System.out.println(sort(array));   
        }
		
		scanner.close();
	}

	private static int sort(int[] array) {
        int swaps = 0;
		for (int i = 1; i < array.length; i++) {
			
			for (int j = i; j > 0; j--) {
				
				if (array[j] < array[j-1]) {
					swap (array, j, j-1);
                    swaps ++;
				}
				
			}
		}
        
        return swaps;
	}
    
    private static void swap (int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
}
