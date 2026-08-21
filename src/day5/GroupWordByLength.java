package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordByLength {
public static void main(String[] args) {
	String str1="one two three four five six seven eight nine ten";
	Map<Integer,List<String>> hashmap=new HashMap();
	String words[]=str1.split(" ");
	for(String word:words)			//word
	{								//three
	
		int key=word.length();      //key=5
		hashmap.putIfAbsent(key,new ArrayList());
		
		hashmap.get(key).add(word);
	}
	System.out.println(hashmap.values());
}
}

/*
{
3=		[one,two]
5=      [ three]
} 
*/

/*
{
3=[one,two,six,ten]
4=[four,five,nine]
5=[seven,three]

[[one,two,six,ten],[four,five,nine],[seven,three]]
*/