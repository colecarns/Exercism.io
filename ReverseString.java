import java.util.*;
import java.io.*;
class ReverseString {

	public static void main(String args [])
	{
		String str = "Fook";
		reverse(str);
	}
	
    static String reverse(String inputString) 
    {
       StringBuilder input1 = new StringBuilder();
       input1.append(inputString);
       input1 = input1.reverse();
       System.out.println(input1);
    
       return inputString;
    }
  
}