package warmup;

public class Solution1 {
	
	public int solution(int N) {
		
		int count = 0;
		
		for (int i = 0; i <= N; i++) {
			count += countDigit(String.valueOf(i), '1');
		}
		
		return count;
	}
	
	/**
	 * Generic method to count a digit i
	 * @param number
	 * @param digit
	 * @return
	 */
	private int countDigit (String number, char digit) {
		
		int count = 0;
		
		for (int i = 0; i < number.length(); i++) {
			
			if (number.charAt(i) == digit) {
				count ++;
			}
		}
		
		return count;
		
	}
}
