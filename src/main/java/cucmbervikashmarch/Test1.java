package cucmbervikashmarch;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
	public static void swap(int[] a, int  low,  int high){
		int temp = a[low];
		a[low] = a[high] ;
		a[high]  =temp;
		}

		    public static void main(String[] args) {
		        int[]  arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		        String a = "automation testing";
		        
		        Map<Character, Long>  map1= a.chars().mapToObj(s->(char)s).
		        	      collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 
		int low =0; 
		int high = arr.length-1;
		while(low<=high){
		 
		if(arr[low]>0){
		swap( arr, low, high);
		high--;
		}
		 
		else if(arr[low]==0){
		low++;
		}
		    }
		    System.out.println(Arrays.toString(arr));
		}}