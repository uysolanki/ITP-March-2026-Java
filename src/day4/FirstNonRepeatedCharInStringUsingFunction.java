package day4;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharInStringUsingFunction {
public static void main(String[] args) {
	String str1="Virat Kohli";  //output 'i'
	//String str1="mahendra singh dhoni";  //output 'a'
	//String str1="rohit sharma";  //output 'r'
	//String str1="suryakumar";  //output 'u'
	//String str1="mango";  //output no char found
	//String str1="";
	//String str1=null;
	//String str1="            ";  
	//short circuiting
	
	if( str1==null || str1.length()==0 || str1.trim().length()==0 )
	//if( str1.length()==0 || str1==null ||  str1.trim().length()==0 )
	{
		System.out.println("Invalid String");
	}
	else
	{
	str1=str1.replaceAll("\\s+", "").toLowerCase();
	System.out.println(str1);
	char ch=findFirstRepeatedChar(str1);
	
	if(ch=='0')
		System.out.println("no char found");
	else
		System.out.println("First Non Repeating char is "+ch);
	}
}

private static char findFirstRepeatedChar(String str1) {
	Map<Character,Integer> hashmap=new HashMap();
	for(char c: str1.toCharArray())                //c
	{                                              //'v'
		hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
	}
	
	System.out.println(hashmap);
	for(char c: str1.toCharArray())                
	{
		if(hashmap.get(c)==1)
		{
			return c;
		}
	}
	
	return '0';
}
}
