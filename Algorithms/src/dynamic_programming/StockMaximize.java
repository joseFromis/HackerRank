package dynamic_programming;

import java.math.BigInteger;
import java.util.Scanner;

public class StockMaximize {

	    public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int amount = scanner.nextInt();
			
	        for (int i = 0; i < amount; i++) {
	            int size = scanner.nextInt();
	            int[] array = new int[size];
	            
	            for (int j = 0; j < size; j++) {
	                array[j] = scanner.nextInt();
	            }
	            
	            stockMaximize(array, size);
	        }
	        
	        scanner.close();
		}

		private static void stockMaximize (int[] array, int size) {
	        
	        BigInteger max_value = BigInteger.ZERO;
	        BigInteger profit = BigInteger.ZERO;
	        
			for (int i = size - 1; i >= 0; i--) {
	            max_value = max_value.max(BigInteger.valueOf(array[i]));
	            profit = profit.add(max_value.subtract(BigInteger.valueOf(array[i])));
	        }
					
			System.out.println(profit);
			
		}

	}
	    