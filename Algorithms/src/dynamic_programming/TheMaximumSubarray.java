package dynamic_programming;

import java.util.*;

public class TheMaximumSubarray {

   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int amount = scanner.nextInt();
		
        for (int i = 0; i < amount; i++) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }
            
            maxSubarray(array, size);
            
            scanner.close();
        }
        
	}

	private static void maxSubarray (int[] array, int size) {
        int [] max_array = new int [size];
        int [] total_array = new int [size];
        
        int max = array[0];
        
        max_array[0] = array[0];
        total_array[0] = array[0];
		  
		for (int i = 1; i < size; i++) {
            max_array[i] = Math.max(max_array[i-1] + array[i], array[i]);
            max = Math.max(max_array[i], max);
            
            total_array[i] = Math.max(Math.max(total_array[i-1] + array[i], total_array[i-1]), array[i]);
        }
				
		System.out.println(max + " " + total_array[size-1]);
	}
}