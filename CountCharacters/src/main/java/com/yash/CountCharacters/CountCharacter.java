package com.yash.CountCharacters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacter {

	public String countCharactersInString(String inputString) {

		Map<String, Long> frequentChars = Arrays.stream(inputString.toLowerCase().split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		List<String> listString = Arrays.stream(inputString.split("")).distinct().collect(Collectors.toList());
		String resultString = "";

		for (String character : listString) {
			if (frequentChars.containsKey(character)) {
				resultString = resultString + character + frequentChars.get(character);
			}
		}

		return resultString.replace("1", "");

//		for (String character : listString) {
//			if (frequentChars.containsKey(character) && frequentChars.get(character) > 1) {
//				resultString = resultString + character + frequentChars.get(character);
//			} else if (frequentChars.get(character) == 1)
//				resultString = resultString + character;
//		}
//
//		return resultString;

//		listString.forEach(character -> {
//	    	String resultString = "";
//	    	if(frequentChars.containsKey(character) && frequentChars.get(character) >1 ) {
//	    		resultString = resultString+character+frequentChars.get(character);
//	    	}
//	    	else if(frequentChars.get(character) == 1)
//	    		resultString = resultString+character;
//	    	System.out.print(resultString);
//	    });
//		

//	    Arrays.stream(inputString.split("")).forEach(character -> {
//	    	String resultString = "";
//	    	if(frequentChars.containsKey(character) && frequentChars.get(character) >1 ) {
//	    		resultString = resultString+character+frequentChars.get(character);
//	    	}
//	    	else if(frequentChars.get(character) == 1)
//	    		resultString = resultString+character;
//	    	System.out.print(resultString);
//	    });
//	    

		// System.out.println(frequentChars);

		// return frequentChars;

	}

}
