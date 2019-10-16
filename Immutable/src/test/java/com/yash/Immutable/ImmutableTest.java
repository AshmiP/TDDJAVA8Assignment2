package com.yash.Immutable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableTest  {

	
	@Test
	public void shouldCheckImmutable() {
		 Immutable actual = Immutable.create(10);
		 assertEquals(10,actual.getI());
	}
	
	
}
