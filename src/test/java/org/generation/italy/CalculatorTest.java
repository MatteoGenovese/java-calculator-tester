package org.generation.italy;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeAll
	private static void beforeAll() {
		
		calc = new Calculator(1,0);
	}
	
	@Test
	@DisplayName("Addition")
	void testAddition() {
		
		float value = calc.add();
		
		assertEquals(
				1, 
				value);
	}
	
	@Test
	@DisplayName("Subtraction")
	void testSubtraction() {
		
		float value = calc.subtract();
		
		assertEquals(
				1, 
				value);
	}
	
	@Test
	@DisplayName("Division")
	void testDivision() {
		
		float value = calc.divide();
		
		assertEquals(
				1, 
				value, 
				"Non è possibile dividere per 0");
	}
	
	@Test
	@DisplayName("Multiplication")
	void testMultiplication() {
		
		float value = calc.multiply();
		
		assertEquals(
				0, 
				value);
	}



}
