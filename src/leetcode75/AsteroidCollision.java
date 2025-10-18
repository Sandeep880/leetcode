package leetcode75;

import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		
		int asteroids[] = {-2, -1, 1, 2};
		
		Stack<Integer> stack = new Stack<>();
		
		for(int as : asteroids)
		{
			if(as > 0)
			{
				stack.push(as);
			}
			while(!stack.isEmpty() && stack.peek() < -as && stack.peek() >0)
			{
				stack.pop();
			}
			if(stack.isEmpty() || stack.peek() < 0)
			{
				stack.push(as);
			}
			else if(stack.peek() == -as)
			{
				stack.pop();
			}
		}
		
		stack.stream().mapToInt(Integer :: intValue).forEach(n -> System.out.print(n + " "));
		
		
		
		//stack.stream().forEach(n -> System.out.print(n));

	}

}
