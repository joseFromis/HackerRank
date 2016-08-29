package others;

import java.util.HashMap;
import java.util.Map;

import datastructures.impl.Stack;

public class CheckBalancedParenthesesInExpression {
    
    private static Stack<Character> stack = new Stack<Character>();
    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static {
	brackets.put('{', '}');
	brackets.put('(', ')');
	brackets.put('[', ']');
    }
    
    public static void main(String[] args) {
	String text = "[()]{}{[()()]((([][]{[]})))}";
	
	System.out.print(text);
	System.out.println(isBalanced(text));
    }
    
    public static boolean isBalanced (String text) {
	
	for (int i = 0; i < text.length(); i++) {
	    char data = text.charAt(i);
	    
	    if (brackets.containsKey(data)) {
		stack.push(data);
	    } else {
		if (stack.isEmpty() || data != brackets.get(stack.pop())) {
		    return false;
		}
	    }
	}
	
	return stack.isEmpty();
    }
}
