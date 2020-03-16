package Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	//This map will be used to store the fibonacci values as we calculate them, to save time
	//Usually recursion for fibonacci requires O(2^n) time, since it calculates each number in the 
	//sequence many times. By storing the values, we will only need to calculate each number once
	
	private static Map<Integer, Integer> oldFibs = new HashMap<>();
	private static boolean debug = true;
	
	public static int calcFib(int n) {
		//Not possible to find a negative fibonacci number so we will throw an exception here
		if (n < 0) {
			
			throw new IllegalArgumentException("Index was negative! That is not possible! Try again.");
			
		} else {
			
			//to ensure we don't recurse forever, we have our base cases
			if (n == 0 || n == 1) {
				return n;
			}
			
		}
		
		//we may have calculated this before, so check to see if we have
		if (oldFibs.containsKey(n)) {
			if (debug)
				System.out.println("Grabbing from OldFibs: " + n);
			return oldFibs.get(n);
		}
		
		//if we haven't seen it before, we will need to calculate it
		if (debug) 
			System.out.println("Calculating new Fib: " + n);
		int result = calcFib(n - 1) + calcFib(n - 2);
		
		//now remember this result so we don't need to calculate it again
		oldFibs.put(n, result);
		
		return result;
	}

}
