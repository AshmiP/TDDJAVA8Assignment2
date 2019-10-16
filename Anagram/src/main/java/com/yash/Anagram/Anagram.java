package com.yash.Anagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public boolean checkStringsAreAnagram(String str1, String str2) {

		List<Character> list1= str1.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
		List<Character> list2= str2.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
		list2.removeAll(list1);
		
		return list2.size()==0?true:false;
		
		
//		String s1 = str1.replaceAll("\\s", "");
//		String s2 = str2.replaceAll("\\s", "");
//		boolean status = true;
//		if (s1.length() != s2.length()) {
//			status = false;
//		} else {
//			char[] ArrayS1 = s1.toLowerCase().toCharArray();
//			char[] ArrayS2 = s2.toLowerCase().toCharArray();
//			Arrays.sort(ArrayS1);
//			Arrays.sort(ArrayS2);
//			status = Arrays.equals(ArrayS1, ArrayS2);
//		}
//		if (status) {
//			return true;
//		} else {
//			return false;
//		}
		
		
		
		
		//return false;

	}

}
