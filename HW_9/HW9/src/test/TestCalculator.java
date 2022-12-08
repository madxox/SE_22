package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int test1 = 3 + 5;
		int act1 = calculator.add(3, 5);
		assertEquals(test1, act1);
		
		int test2 = -100 + 30;
		int act2 = calculator.add(-100, 30);
		assertEquals(test2, act2);
		
		int test3 = -100 + -10;
		int act3 = calculator.add(-100, -10);
		assertEquals(test3, act3);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int test1 = 3 - 5;
		int act1 = calculator.sub(3, 5);
		assertEquals(test1, act1);
		
		int test2 = -100 - 30;
		int act2 = calculator.sub(-100, 30);
		assertEquals(test2, act2);
		
		int test3 = -100 - -10;
		int act3 = calculator.sub(-100, -10);
		assertEquals(test3, act3);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int test1 = 3 * 5;
		int act1 = calculator.multiply(3, 5);
		assertEquals(test1, act1);
		
		int test2 = -100 * 30;
		int act2 = calculator.multiply(-100, 30);
		assertEquals(test2, act2);
		
		int test3 = -100 * -10;
		int act3 = calculator.multiply(-100, -10);
		assertEquals(test3, act3);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		int test1 = 3/5;
		int act1 = (int) calculator.divide(3, 5);
		assertEquals(test1, act1);
		
		int test2 = -100/30;
		int act2 = (int) calculator.divide(-100, 30);
		assertEquals(test2, act2);
		
		int test3 = -100/-10;
		int act3 = (int) calculator.divide(-100, -10);
		assertEquals(test3, act3);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(6, 0);
		}, "Exception thrown");
	}
}
