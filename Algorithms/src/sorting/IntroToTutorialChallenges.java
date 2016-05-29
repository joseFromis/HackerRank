package sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int value = scanner.nextInt();
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println(search(array, value));
		
		scanner.close();
	}

	private static int search(int[] array, int value) {
		
		int minIndex = 0;
		int maxIndex = array.length - 1;
		int midleIndex;
		
		while (minIndex <= maxIndex) {
		
			midleIndex = minIndex + (maxIndex - minIndex) / 2;
			
			if (array[midleIndex] == value) {
				return midleIndex;
			
			} else if (value < array[midleIndex]) {
				maxIndex = midleIndex - 1;
			
			} else if (value > array[midleIndex]) {
				minIndex = midleIndex + 1;
			
			} else {
				break;
			}
			
		}
		
		return -1;
	}
}
