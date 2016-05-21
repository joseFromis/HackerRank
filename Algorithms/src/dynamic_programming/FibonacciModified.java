package dynamic_programming;

import java.util.*;
import java.math.BigInteger;

public class FibonacciModified {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int size = scanner.nextInt();
        
        BigInteger[] array = new BigInteger[size];
        array[0] = BigInteger.valueOf(n1);
        array[1] = BigInteger.valueOf(n2);
		
        for (int i = 2; i < size; i++) {
            array[i] = (array[i-1].multiply(array[i-1])).add(array[i-2]);
        }
        
        System.out.println(String.valueOf(array[size-1]));
        scanner.close();
	}

}
