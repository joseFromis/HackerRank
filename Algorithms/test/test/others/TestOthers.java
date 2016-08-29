package test.others;

import org.junit.Assert;
import org.junit.Test;

import others.CheckBalancedParenthesesInExpression;

public class TestOthers {
    
    @Test
    public void CkeckBalancedParenthesesInExpression() {
	String testExpression1 = "[()]{}{[()()]((([][]{[]})))}";
	String testExpression2 = "[()]{}{[()()]((([][][])))}";
	
	Assert.assertTrue(CheckBalancedParenthesesInExpression.isBalanced(testExpression1));
	Assert.assertTrue(CheckBalancedParenthesesInExpression.isBalanced(testExpression2));
	Assert.assertTrue(CheckBalancedParenthesesInExpression.isBalanced(""));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced(" "));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced(testExpression1 + "}"));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced(testExpression1 + "{"));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced("{" + testExpression1));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced("}" + testExpression1));
	Assert.assertFalse(CheckBalancedParenthesesInExpression.isBalanced("A" + testExpression1));
    }
}
