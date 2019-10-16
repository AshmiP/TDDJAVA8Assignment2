package com.yash.SortHashMap;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Test;

public class SortHashMapTest {

	private SortHashMap sortHashMap = new SortHashMap();

	@Test
	public void shouldReturnSortedHashMapInAscendingOrder() {
		HashMap<Integer, Integer> mapOfInteger = new HashMap<Integer, Integer>() {
			{
				put(1, 99);
				put(2, 55);
				put(3, 44);
				put(4, 11);
				put(5, 22);
			}
		};

		HashMap<Integer, Integer> expectedMapOfInteger = new LinkedHashMap<Integer, Integer>() {
			{
				put(4, 11);
				put(5, 22);
				put(3, 44);
				put(2, 55);
				put(1, 99);
			}
		};

		HashMap<Integer, Integer> actualMapOfInteger = sortHashMap.sortHashMapInAscendingOrder(mapOfInteger);

		assertEquals(expectedMapOfInteger.toString(), actualMapOfInteger.toString());
	}

	
	
	
	
}
