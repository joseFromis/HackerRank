package dynamic_programming;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] children = new int[size];
        int[] candies = new int[size];
        int total = 0;
        
        for (int i = 0; i < size; i++) {
        	children[i] = scanner.nextInt();
        	candies[i] = 1;
        }
        
        for (int i = 0; i < size; i++) {
        	
        	if (i - 1 >= 0 && children[i] > children[i -1] && candies[i] <= candies[i -1]) {
        		candies[i] = candies[i - 1]++;
        	}
        	
        	if (i + 1 < size && children[i] > children[i + 1] && candies[i] <= candies[i + 1]) {
        		candies[i] = candies[i + 1]++;
        	}
        	        	
        }
        
        
        
        for (int i = 0; i < size; i++) {
        	total = total + candies[i];
        }
        
        System.out.println(total);
        
        for (int i = 0; i < size; i++) {
        	System.out.println(candies[i]);
        }
        
        scanner.close();
    }
    
   
}