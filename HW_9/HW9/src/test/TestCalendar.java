package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	GregorianCalendar gc = new GregorianCalendar();
	
	
	@ParameterizedTest
	@ValueSource(ints = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044})
	public void Should_return_true(int year) {
		Calendar c = new Calendar(year);
		assertTrue(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {1700, 1800, 1900, Integer.MIN_VALUE, Integer.MAX_VALUE})
	public void Should_return_false(int year) {
		Calendar c = new Calendar(year);
		assertFalse(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2000, -3, -2, 0, 1900, 2000}) //year 0 in gregorian calendar = 1 BC 
	public void Should_return_if_year_is_leap(int year) {
		Calendar c = new Calendar(year);
		assertEquals(c.isLeapYear(), gc.isLeapYear(year));
	}

	// Create a new method for boundary testing
}
