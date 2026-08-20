package day4;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharInString {
public static void main(String[] args) {
	//String str1="Virat Kohli";  //output 'i'
	//String str1="mahendra singh dhoni";  //output 'a'
	//String str1="rohit sharma";  //output 'r'
	//String str1="suryakumar";  //output 'u'
	String str1="mango";  //output no char found
	
	str1=str1.replaceAll("\\s+", "").toLowerCase();
	System.out.println(str1);
	
	Map<Character,Integer> hashmap=new HashMap();
	for(char c: str1.toCharArray())                //c
	{                                              //'v'
		hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
	}
	
	System.out.println(hashmap);
	int flag=0;
	for(char c: str1.toCharArray())                
	{
		if(hashmap.get(c)>1)
		{
			System.out.println(c);
			flag=1;
			break;
		}
	}
	
	if(flag==0)
		System.out.println("no char found");
}
}
