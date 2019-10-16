package com.yash.SortHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

	public HashMap<Integer, Integer> sortHashMapInAscendingOrder(HashMap<Integer, Integer> mapOfInteger) {
 
		
		return mapOfInteger.entrySet()
		.stream()
		.sorted(Map.Entry.<Integer, Integer>comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,
		               Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		
	}

}
