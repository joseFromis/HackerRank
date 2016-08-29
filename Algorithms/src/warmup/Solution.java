package warmup;

public class Solution {
    public int solution(int[] A) {
        
        int size = A.length;
        
        if (size == 0){
        	return -1;
        }
        
        int total = 0;
        int left = 0;
        
        for (int i = 0; i < size; i++) {
        	total += A[i];
        }
        
        for (int i = 0; i < size; i++) {
        	total -= A[0];
        	
        	if (left == total) {
        		return i;
        	}
        	
        	left += A[i];
        }
        
        return -1;
    }
}