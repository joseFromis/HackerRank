package implementation;

import java.util.Scanner;

public class NewYearChaos {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            
            System.out.println(getMinimumNumberOfBribes(q));
        }
        
        in.close();
    }
	
	protected static String getMinimumNumberOfBribes (final int q[]) {
		String result = "Too chaotic";
		int count = 0;
		
		final int size = q.length;
		
		for (int i = size - 1; i >= 1 ; i--) {
		
			if (q[i] != i + 1) {
				
				if (q[i-1] == i + 1) {
					swap(q, i, i-1);
					count++;
				} else if (q[i-2] == i + 1) {
					swap(q, i-1, i-2);
					swap(q, i, i-1);
					count = count +2;
				} else {
					break;
				}
				
			}
			
		}
		
		if (count > 0) {
			result = Integer.toString(count);
		}
		
		return result;
	}
	
	private static void swap (final int array[], final int i, final int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
}
