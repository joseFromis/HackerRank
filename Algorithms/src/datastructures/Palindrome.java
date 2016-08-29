package datastructures;

public final class Palindrome {

    public static void main(String[] args) {
	int number = 12345;
	int tmp, rev = 0;
	
	while (number > 0) {
	    rev = rev * 10 + number % 10;
	    number = number / 10;
	}
	
	System.out.println(String.valueOf(rev));
    	
    }

}
