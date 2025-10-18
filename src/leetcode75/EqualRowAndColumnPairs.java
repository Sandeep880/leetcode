package leetcode75;

import java.util.HashMap;

public class EqualRowAndColumnPairs {

	public static void main(String[] args) {
		int grid[][] = {{3,2,1},{1,7,6},{2,7,7}};
		
		
		//System.out.println(equalPairs(grid));
		
		System.out.println(equalPairsS(grid));
		
		//equalPairsS(grid);

	}
	
	public static int equalPairsS(int[][] grid) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int res=0;
		
		for(int i=0;i<grid.length;i++)
		{
			StringBuilder str = new StringBuilder();
			for(int j=0;j<grid[0].length;j++)
			{
				str.append(grid[i][j]).append("*");
			}
			String rowString = str.toString();
			if(map.containsKey(rowString))
				map.put(rowString, map.get(rowString) +1);
			else
				map.put(rowString, 1);
		}
		
		for(int j=0;j<grid[0].length;j++)
		{
			StringBuilder str = new StringBuilder();
			for(int i=0;i<grid.length;i++)
			{
				str.append(grid[i][j]).append("*");
			}
			String colString = str.toString();
			if(map.containsKey(colString))
			{
				res = res + map.get(colString);
			}
		}
		
		return res;
	}
	
	
	public static int equalPairs(int[][] grid) {
        int res=0;
		
		
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				boolean b = true;
				for(int k=0;k<grid.length;k++)
				{
					if(grid[i][k] != grid[k][j])
					{
						b = false;
						break;
					}
				}
				if(b)
					res++;
			}	
		}
		
		return (res);
	}

}
