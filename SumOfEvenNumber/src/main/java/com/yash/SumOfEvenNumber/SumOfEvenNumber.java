package com.yash.SumOfEvenNumber;

import java.util.Arrays;

public class SumOfEvenNumber {

	public Integer calculateSumOfEvenNumbers(Integer[] numberList) {

		return Arrays.asList(numberList).stream()
		      .filter(number->number%2==0)
		      .reduce(0,Integer::sum);
	}

}
