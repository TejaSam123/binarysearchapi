package com.search.binarysearchapi.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.search.binarysearchapi.model.Search;

@Service
public class SearchService {
	 public int findKeyFromSortedRotatedArray(Search search) {
		 	Integer[] reversedArray = search.getSortedArray();
		 	int key = search.getKey();
	    	int start = 0;
	    	int end = reversedArray.length-1;
	    	int randomPivot = findSomePivot(reversedArray, start, end);
	    	
	    	if(randomPivot == -1) {
	    		keySearch(reversedArray, start, end, key);
	    	}
	    	
	    	 if (key == reversedArray[randomPivot])
	             return randomPivot;
	         if (key >= reversedArray[start])
	             return keySearch(reversedArray, start, randomPivot - 1, key);
	         return keySearch(reversedArray, randomPivot + 1, end, key);
	       
	    	
	    }
	    public int findSomePivot(Integer[] reversedArray, int start, int end) {
	    	if(start == end) {
	    		return start;
	    	}else if(end < start) {
	    		return -1;
	    	}
	    	
	    	int middleIndex = (start + end) / 2;
	    	
	        if (middleIndex < end && reversedArray[middleIndex] > reversedArray[middleIndex + 1])
	            return middleIndex;
	        if (middleIndex > start && reversedArray[middleIndex] < reversedArray[middleIndex - 1])
	            return (middleIndex - 1);
	        if (reversedArray[start] >= reversedArray[middleIndex])
	            return findSomePivot(reversedArray, start, middleIndex - 1);
	        
	        return findSomePivot(reversedArray, middleIndex + 1, end);	
	    }
	    
	    public int keySearch(Integer[] reversedArray, int start, int end, int key) {
	    	if (start > end) return -1;
	        int middleIndex = (start + end) / 2;
	        if (key == reversedArray[middleIndex])
	            return middleIndex;
	        if (key > reversedArray[middleIndex])
	            return keySearch(reversedArray, (middleIndex + 1), end, key);
	        
	        return keySearch(reversedArray, start, (middleIndex - 1), key);	
	    }
}
