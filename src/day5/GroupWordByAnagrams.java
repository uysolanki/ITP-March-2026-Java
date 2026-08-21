package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordByAnagrams {
public static void main(String[] args) {
	String str1="silent listen cab bca abc note tone";
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
{		[tone,note]
3=		[silent,listen]
5=      [cab,bca,abc]
} 
*/

/*
{
3=[one,two,six,ten]
4=[four,five,nine]
5=[seven,three]

[[one,two,six,ten],[four,five,nine],[seven,three]]
*/