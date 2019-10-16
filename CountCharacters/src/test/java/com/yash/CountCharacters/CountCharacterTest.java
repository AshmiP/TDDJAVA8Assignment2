package com.yash.CountCharacters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountCharacterTest  {

	private CountCharacter countCharacters = new CountCharacter();
	
	@Test
	public void shouldCountCharactersInString() {
		String inputString = "iamyashemployee";
		String expectedString = "ia2m2y2she3plo";
		
		String actualString = countCharacters.countCharactersInString(inputString);
		
		assertEquals(expectedString,actualString);
	}
	
}
