package demo.naukri;

import java.util.Iterator;

public class Arith {
	public static void main(String[] args) {
		testArith();
	}
	
       public static void testArith() {
    	   int a = 10;
    	   int b = 20;
    	   int c = a-b;
    	   String name = "Rama";
    	   String name1 = "Reddy";
    	   
    	   System.out.println("name second name "+ (a-b));
    	   System.out.println(""+c);
    	   
    	   String[] names = {"Rama", "Reddy", "Subbu", "Yashu"};
    	   System.out.println("Length : "+names.length);
    	   
    	   System.out.println("First name : "+names[0]);
    	   System.out.println("third name : "+names[2]);
    	   int length =  names.length;
    	   //name[0], name[1] 
    	   for (int i = 0; i <=4; i++) {
    		   System.out.println(names[i]);
			
		}
    	   
    	   
    	   
       }
}
