package com.yash.Doubleton;

import static org.hamcrest.CoreMatchers.anyOf;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoubletonDemoTest {

	@Test
	public void shouldCheckDoubleton() {


		DoubletonDemo doubletonDemo1 = DoubletonDemo.getInstance();
		DoubletonDemo doubletonDemo2 = DoubletonDemo.getInstance();
		DoubletonDemo doubletonDemo3 = DoubletonDemo.getInstance();
		
		assertThat(doubletonDemo1.hashCode(),anyOf(is(doubletonDemo2.hashCode()), is(doubletonDemo3.hashCode())));
		
	}
	
	
}
