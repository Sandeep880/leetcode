package leetcode75;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {

	public static void main(String[] args) {
		
		int citations[] = {3,0,6,1,5};
		
		int res = hIndex(citations);
		
		System.out.println(res);

	}
	
	public static int hIndex(int[] citations) {
	    
	    Arrays.sort(citations);
	    reverse(citations);
	    int h=0;
	    for(int i=0;i<citations.length;i++)
	    {
	    	if(citations[i] >= i+1)
	    		h= i+1;
	    	else
	    		break;
	    }
	    return h; 
	    
	        
	    }
	
	public static void reverse(int citations[]) {
		int i=0 , j = citations.length-1;
		while(j > i )
		{
			int temp = citations[i];
			citations[i] = citations[j];
			citations[j] = temp;
			i++;
			j--;
		}
	}
	

}
