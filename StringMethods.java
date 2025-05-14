package com.StringSyntax;
/*
 * As of Java 21 (the latest LTS version as of 2025), the String class in Java has over 70 public methods.
 *  The exact number can vary slightly depending on the Java version, but typically:
   There are around 75–80 public methods.
 */

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = "Hello";
		
		// Basic Inspection :
		System.out.println("Length : "+str.length());       //return the length of string (size)
		System.out.println("charAt : "+str.charAt(1));      //return the char value of specific index  
		System.out.println("isEmpty : "+str.isEmpty());     //returns true if length() = 0 
		
		//Comparison : 
		System.out.println("Equals : "+str.equals(str1));   //returns true if contents of string are same
		System.out.println("EqualsIgnoreCase : "+str.equalsIgnoreCase(str1));  //Two strings are considered equal ignoring case if they are of the same length 
		System.out.println("compareTo : "+str.compareTo(str1));   // compares the string lexicographically
	                 /*
	                  * if 0 : 	If both strings are equal	 
	                  * if <0 : current string is lexicographically less than the specified string
	                  * if >0 : current string is lexicographically grater than the specified string           
	                  */
		
		//Searching
		System.out.println("contains : "+str.contains("llo"));   // Returns true if and only if this string contains the specified sequence of char values.
		
		//Modification
		System.out.println("replace : "+str.replace('o', 'O'));  //replace the old character with new
		System.out.println("concat : "+str.concat(str1));  // Concatenates the specific string
		System.out.println("toLowerCase : "+str.toLowerCase());  //converts to lower case
		System.out.println("toUpperCase : "+str.toUpperCase());  //converts to upper case
		System.out.println("Strip : "+str.strip());        // removes white space from string
		System.out.println("Trim : "+str.trim());        //Removes spaces, tabs, and newlines from the beginning and end of a string.


	
		           
	}

}
