package Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void testCalcFib0() {
		try {
			Fibonacci.calcFib(-3);
			fail("An exception should have been thrown");
		} catch (IllegalArgumentException e) {
			//It passes. Correctly threw an exception for illegal input
		}
	}
	
	@Test
	void testCalcFib1() {
		try {
			Fibonacci.calcFib(-1);
			fail("An exception should have been thrown");
		} catch (IllegalArgumentException e) {
			//Passes. Exception was correctly thrown
		}
	}
	
	@Test
	void testCalcFib2() {
		try {
			Fibonacci.calcFib(-1879439);
			fail("An exception should have been thrown");
		} catch (IllegalArgumentException e) {
			//Passes. Exception was correctly thrown
		}
	}
	
	@Test
	void testCalcFib3() {
		assertEquals(Fibonacci.calcFib(0), 0);
	}
	
	@Test 
	void testCalcFib4() {
		assertEquals(Fibonacci.calcFib(1), 1);
	}
	
	@Test
	void testCalcFib5() {
		assertEquals(Fibonacci.calcFib(2), 1);
	}
	
	@Test
	void testCalcFib6() {
		assertEquals(Fibonacci.calcFib(9), 34);
	}
	
	@Test
	void testCalcFib7() {
		assertEquals(Fibonacci.calcFib(16), 987);
	}
	
	@Test
	void testCalcFib8() {
		assertEquals(Fibonacci.calcFib(18), 2584);
	}
	
	@Test
	void testCalcFib9() {
		assertEquals(Fibonacci.calcFib(20), 6765);
	}
	
	@Test
	void testCalcFib10() {
		assertEquals(Fibonacci.calcFib(39), 63245986);
	}

}
