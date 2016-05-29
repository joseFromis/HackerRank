package sorting;

import java.util.Scanner;

public class InsertionSortPart2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
       
		insertionSortPart2(ar);
		
		in.close();
    }
	
	public static void insertionSortPart2(int[] ar) {
		
		int size = ar.length;
		int tmp;
		
		for (int i = 1; i < size; i++) {
			
			for (int j = i - 1; j >= 0; j--) {
				
				if (ar[j + 1] < ar[j]) {
					tmp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = tmp; 
				}
				
			}
			
			printArray(ar);
			
		}
		
	}
	
	
	    
    private static void printArray(int[] ar) {
    	for(int n: ar){
    		System.out.print(n+" ");
    	}
        
    	System.out.println("");
    }  
	
}
