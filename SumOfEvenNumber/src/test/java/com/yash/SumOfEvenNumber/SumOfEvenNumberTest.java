package com.yash.SumOfEvenNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenNumberTest {

	private SumOfEvenNumber sum = new SumOfEvenNumber();
	
	@Test
	public void shouldCheckSumOfEvenNumbersInList() {
	
		Integer[] numberList = {12,3,45,65,8,9,10,4,6};
		Integer expectedSum = 40;
		
		Integer actualSum = sum.calculateSumOfEvenNumbers(numberList);
		
		assertEquals(expectedSum, actualSum);
		
		
	}
	
}
