package com.yash.LeadersInArray;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LeadersInaArrayTest {
	
	private Leaders leaders = new Leaders();
	
	@Test
	public void shouldGetAllLeadersInGivenIntegerArray() {
		
		Integer[] array =  {16, 17, 4, 3, 5, 2};
		List<Integer> expectedLeaders = Arrays.asList(2,5,17);
		
		List<Integer> actualLeaders = leaders.getLeadersInArray(array);

		assertEquals(expectedLeaders, actualLeaders);
	}

}
