package leetcode75;

//class P{
//	   static{
//	       System.out.println("static block");
//	    }
//	 
//	   {
//	       System.out.println("instance block");
//	    }
//	 
//	   public P(){
//	     System.out.println("Parent Constructor");
//	    }
//	}
//	 
//	class C extends P{
//	   static{
//	       System.out.println("static block child");
//	    }
//	 
//	   {
//	       System.out.println("instance block child");
//	    }
//	 
//	   public C(){
//	     System.out.println("Child Constructor");
//	    }
//	}

class P{
    public int a = 10;
    public void method(){
    System.out.println("Parent method");
}
}
class C extends P{
    public int a = 20;
    public void method(){
    System.out.println("Child method");
}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P p = new C();
		p.method(); // child Method
		System.out.println(p.a); // error
		
		Integer a = null;
		int b = a;
		System.out.println(b);
		
//		int a = null;
//		Integer b = a;
		System.out.println(b);
		
		System.out.println(test());

	}
	
	public static int test(){
		   try{
		    int a  = 10;
		   int b = 0;
		    System.out.println(a/b);
		   return 2;
		    } catch(Exception ex){
		      return 3;
		    }finally{
		     return 4;
		     }
		}
	
	int arr[] = {1,2,3,4,4,5};
	

}
