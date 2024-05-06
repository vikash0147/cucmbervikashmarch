package cucmbervikashmarch;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//(//div[@class ='a-section']//h2/a/span)[3]
				
				//div[@data-cel-widget='search_result_4']//h2/a/span
		
		
		
		
		//ancestor::div[@class ='puisg-col-inner']//span[@class = 'a-price-whole']
		//div[@class ='a-section']//h2/a/span//ancestor::div[@class ='puisg-col-inner']//span[@class = 'a-price-whole' and text()>800]
		int[] a = {7, 6, 3, 2, 1 };

		Arrays.sort(a);
		int b = a[a.length-1];  

		for(int i =1; i<=b; i++){

		  int  search = Arrays.binarySearch(a, i);
		if(search<0){

			System.out.println("search :-" + i);
		//Printmissing number  search;
		}

		}

	}

}
