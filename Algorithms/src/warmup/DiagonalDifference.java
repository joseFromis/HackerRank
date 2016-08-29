package warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [][] matrix = new int [N][N];
		
        for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = scanner.nextInt();
            }
		}
		
		int firstDiagonal=0, secondDiagonal=0, absDiff=0;
		
		for (int i = 0, j = N-1; i <= N-1; i++, j--) {
			firstDiagonal += matrix[i][i];
            secondDiagonal += matrix[i][j];
		}
		
		absDiff = Math.abs(firstDiagonal - secondDiagonal);

		System.out.println(absDiff);
		
		scanner.close();
	}
}
