package sorting.classic;

public abstract class AbstractClassicSort implements IClassicSort {
	
	protected int[] array;
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	protected void swap (int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;

	}
	
}
