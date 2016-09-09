package implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNewYearChaos {

	int[] array1 = {5, 1, 2, 3, 7, 8, 6, 4};
	
	@Test
	public void test1() {
		NewYearChaos newYearChaos = new NewYearChaos();
		assertTrue("Too chaotic" == newYearChaos.getMinimumNumberOfBribes(array1));
	}

}
