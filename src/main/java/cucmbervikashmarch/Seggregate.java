package cucmbervikashmarch;

import java.util.Arrays;

public class Seggregate {
	
	static void  swap(int[] arr, int low, int  high) {
		
		int temp = arr[high];
		
		arr[high] =arr[low];
		arr[low] =temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr =  {1,0,1,0,0,1,3,2,1,0,0,2};
		
		int low =0, mid =0, high=arr.length-1;
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
				 swap(arr,  low,mid );
				 mid++; low++;
									
			}
			else if  (arr[mid]==1) {
				mid++;
				
			}
			
			else  {
				swap(arr, mid, high );
								
				high--;
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	

}
