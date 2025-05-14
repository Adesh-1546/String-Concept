package com.StringSyntax;


public class Demo {
	public static void main (String [] args) {
		
		// String creation methods :
		
		// Case 1: String literal - stored in String Constant Pool (SCP)
				String str1 = "hello";
				String str2 = "hello";

	    // Case 2: Using new keyword - stored in Heap
				String str3 = new String("hello");
				String str4 = new String("hello");
				
				
		 System.out.println("str1 == str2 : "+(str1==str2)); // true (SCP)        
		 System.out.println("str1 == str3 : "+(str1==str3)); // false (SCP vs HEAP)
		 System.out.println("str3 == str4 : "+(str3==str4)); // false (Different heap object)
		 
		 
		 System.out.println("--------------------------");
		 
		 
		 // Value comparison using .equals()
	     System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
	     
	     System.out.println("--------------------------");
		 
	  // Interning str3 to refer SCP memory
	     String str5 = str3.intern();
	     System.out.println("str1 == str5 (after intern): " + (str1 == str5));  //true
		
	}

}
