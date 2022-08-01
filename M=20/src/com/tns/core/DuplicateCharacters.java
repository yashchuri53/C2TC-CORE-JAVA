package com.tns.core;

import java.util.*;

public class DuplicateCharacters {
	
	 public static void
	    countDuplicateCharacters(String str)
	    {
	  
	        Map<Character, Integer> map
	            = new HashMap<Character, Integer>();
	  
	        char[] charArray = str.toCharArray();
	  
	        for (char c : charArray) {
	  
	            if (map.containsKey(c)) {
	  
	                map.put(c, map.get(c) + 1);
	            }
	            else {
	  
	            
	                map.put(c, 1);
	            }
	        }
	  
	        for (Map.Entry<Character, Integer> entry :
	             map.entrySet()) {
	  
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey()
	                                   + " : "
	                                   + entry.getValue());
	            }
	        }
	    }
	  
	    public static void
	    main(String args[])
	    {
	        
	        String str = "geeksforgeeks";
	  
	        countDuplicateCharacters(str);
	    }

}
