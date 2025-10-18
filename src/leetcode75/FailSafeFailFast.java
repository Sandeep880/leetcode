package leetcode75;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Parent {
	
	void funct()
	{
		System.out.println("Parent");
	}
}

class Child extends Parent{
	
	void funct() {
		System.out.println("Child");
	}
}

public class FailSafeFailFast {

	public static void main(String[] args) {
		
		
		Parent p = new Child();
		p.funct();
		
		
		
//		List<Integer> list = new CopyOnWriteArrayList<>();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		Iterator<Integer> iter= list.iterator();
//		while(iter.hasNext())
//		{
//			int temp= iter.next();
//			if(temp ==1)
//			{
//				list.remove(temp);
//			}
//			
//		}
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}

	}

}
