package cucmbervikashmarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SumArray {
	
	
		    public static void main(String[] args) {
	        int[] arr = {2, 7, 4,6,  9, 5, 1, 3};
	        List<List<Integer>> result = findThreeElementsWithSum(arr, 9);
	       
	        
	        
	        if (result != null) {
	            System.out.println("Elements found: " + result);
	        } else {
	            System.out.println("No three elements found with sum equal to 9");
	        }
	    }

	    public static List<List<Integer>> findThreeElementsWithSum(int[] arr, int targetSum) {
	    	List<List<Integer>> result = new ArrayList<>();
	    	
	        for (int i = 0; i < arr.length - 2; i++) {
	            for (int j = i + 1; j < arr.length - 1; j++) {
	                for (int k = j + 1; k < arr.length; k++) {
	                    if (arr[i] + arr[j] + arr[k] == targetSum) {
	                    	List<Integer>  comb1 = new ArrayList<>();
	                    	
	                    	comb1.add(arr[i]);comb1.add(arr[j]);comb1.add(arr[k]);
	                    	
	                    result.add(comb1)	;
	                    	
	                    	
	                    	
	                    	                	
	                    	
	                    }
	                }
	            }
	        }
	        return result;
	    }
	    
	    
	    
	    
	           
	    

	}
