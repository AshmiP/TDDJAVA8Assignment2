package com.yash.SecondLargestNumber;


import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

	public Integer findingSecondLargestNumber(Integer[] numberList) {
	
		if(numberList.length == 0) {
			throw new NoElementInArrayException("Array is empty");
		}
		
		else
		return Arrays.asList(numberList).stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
	}

}
