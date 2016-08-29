package others;

import java.util.Stack;

public class LargestRectangularAreaInHistogram {
    
   public static void main(String[] args) {
       int[] histogram = {6,2,5,4,5,4,3,6};
       
       System.out.println(histogram.toString());
       System.out.println(lrah(histogram));
   }

    private static int lrah(int[] histogram) {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	int size = histogram.length;
	int maxArea = 0;
	int currentArea = 0;
	int top = 0;
	int i = 0;
	
	while (i < size) {
	    if (stack.isEmpty() || histogram[stack.peek()] <= histogram[i]) {
		stack.push(i++);
		
	    } else {
		top = stack.pop();
		
		currentArea = histogram[top] * (stack.isEmpty() ? i : i - stack.peek() - 1) ;
		maxArea = Math.max(maxArea, currentArea);
		
		System.out.println("i:" + i + " - maxArea:" + maxArea);
	    }
	    
	}
	
	while (!stack.isEmpty()) {
	    top = stack.pop();
	    
	    currentArea = histogram[top] *  (stack.isEmpty() ? i : i - stack.peek() - 1) ;
	    maxArea = Math.max(maxArea, currentArea);
	}
	
	return maxArea;
    }
}
