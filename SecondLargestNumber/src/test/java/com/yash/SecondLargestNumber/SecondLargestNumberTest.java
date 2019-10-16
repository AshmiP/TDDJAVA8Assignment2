package com.yash.SecondLargestNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecondLargestNumberTest {

	private SecondLargestNumber secondLargestNumber = new SecondLargestNumber();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldCheckSecondLargestNumberInList() {
		Integer[] numList = { 22, 44, 65, 11, 10, 44, 77, 88 };
		Integer expectedSecondLargest = 77;

		Integer acutalSecondHighest = secondLargestNumber.findingSecondLargestNumber(numList);

		assertEquals(expectedSecondLargest, acutalSecondHighest);
	}

	@Test
	public void shouldThrowNoElementInArrayExceptionWhenArrayIsEmpty() {
		Integer[] numList = {};

		thrown.expect(NoElementInArrayException.class);
		thrown.expectMessage("Array is empty");

		secondLargestNumber.findingSecondLargestNumber(numList);

	}

}
