package com.systechafrica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		CalculatorTests calculator = new CalculatorTests();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	private int add(int i, int j) {
		return 0;
	}

	private void assertEquals(int i, int add, String string) {
	}

	/**
	 * @param first
	 * @param second
	 * @param expectedResult
	 */
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CvsSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		CalculatorTests calculator = new CalculatorTests();
		assertEquals(expectedResult, (calculator.add(first, second)),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}




