package leetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Triangle {

	public static void main(String[] args) {
		
		int triangle[][]= {{2},{3,4},{6,5,7},{4,1,8,3}};
		
		int[][] triangleArray = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
		List<List<Integer>> t = new ArrayList<>();

		for (int i = 0; i < triangleArray.length; i++) {
		    List<Integer> row = new ArrayList<>();
		    for (int j = 0; j < triangleArray[i].length; j++) {
		        row.add(triangleArray[i][j]);
		    }
		    t.add(row);
		}
		
		HashMap<String, Integer> map = new HashMap<>();
        map.put("London",1);
        map.put("New York",2);
        map.put("London" , 3);
        
        for(Entry<String, Integer> e : map.entrySet())
        {
        	System.out.println(e.getKey() + " " + e.getValue());
        }
		
		System.out.println(minimumTotal(t));

	}
	
    public static int minimumTotal(List<List<Integer>> triangle) {
    	
    	int path=0;
        
    	for(int i=0;i<triangle.size();i++)
    	{
    		int min = minimum(triangle.get(i).get(i), triangle.get(i).get(i+1));
    		path += min;

    	}
    	
    	return path;
    }
    
    public static int minimum(int num1, int num2)
    {
    	if(num1 > num2)
    		return num2;
    	else
    		return num1;
    }
	

}
