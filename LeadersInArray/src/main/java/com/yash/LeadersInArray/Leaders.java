package com.yash.LeadersInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Leaders {

	public List<Integer> getLeadersInArray(Integer[] arr) {

		int max_from_right =  arr[arr.length-1]; 
		List<Integer> leaders = new ArrayList<Integer>();
	    BiPredicate<Integer,Integer> maxTrue = (number1,number2)->number1<number2;
		 
		leaders.add(arr[arr.length-1]) ;
		
        for (int i = arr.length-2; i >= 0; i--) 
        { 
            if (maxTrue.test(max_from_right, arr[i])) 
            {            
            max_from_right = arr[i]; 
            leaders.add(arr[i]);
           
            } 
        }   
		
	    return leaders;	
	}

}
