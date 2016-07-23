package sorting;

import java.util.Scanner;

public class RunningTimeAlgorithms {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
       
		runningTimeAlgorithms(ar);
		
		in.close();
    }
	
	public static void runningTimeAlgorithms(int[] ar) {
		int size = ar.length;
		int count = 0;
		
		for (int i = 1; i < size; i++) {
			
			int value = ar[i];
			int j = i - 1;
			
			while (j >= 0 && ar[j] > value) {
				ar[j + 1] = ar[j];
				ar[j] = value;
				j--;
				count ++;
			}
			
		}
		
		System.out.println(count);
	}
	
}
