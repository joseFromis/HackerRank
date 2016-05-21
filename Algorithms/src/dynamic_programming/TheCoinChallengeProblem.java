package dynamic_programming;

import java.util.Scanner;

public class TheCoinChallengeProblem {

	    public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int amount = scanner.nextInt();
			
			int size = scanner.nextInt();
			
			int[] coins = new int[size];
			
			for (int i = 0; i < size; i++) {
				coins[i] = scanner.nextInt();
			}
					
			System.out.println(change(coins, amount, size));
			
			scanner.close();
		}

		private static long change (int[] coins, int amount, int size) {
		
			long [][] solution = new long [amount + 1][size];
			
			for (int i = 0; i < size; i++) {
				solution[0][i] = 1;
			}
			
			for (int i = 1; i < amount + 1; i++) {
				
				for (int j = 0; j < size; j++) {
				
					long s1 = 0;
					long s2 = 0;
					
					if (j > 0) {
						s1 = solution[i][j - 1];
					}
					
					if (i - coins[j] >= 0) {
						s2 = solution[i - coins[j]][j];
					}
								
					solution[i][j] = s1 + s2;
				
				}
							
			}
					
			return solution[amount][size - 1];
			
		}
	}
