package com.yash.Anagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnagramTest {

	private Anagram anagram = new Anagram();
	
	@Test
	public void shouldReturnTrueIfStringsAreAnagram() {
		String str1 = "Peek";
		String str2 = "Keep";
		
		
	    boolean expectedResult = true;
	    
	    boolean actualResult = anagram.checkStringsAreAnagram(str1,str2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void shouldReturnFalseIfStringsAreAnagram() {
		String str1 = "Mother In Law";
		String str2 = "Hitler Womans";
	    boolean expectedResult = false;
	    
	    boolean actualResult = anagram.checkStringsAreAnagram(str1,str2);
		
		assertEquals(expectedResult, actualResult);
	}
}
