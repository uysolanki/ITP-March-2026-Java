package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByAnagrams2 {
public static void main(String[] args) {
	String str1="silent listen cab bca abc note tone";
	Map<String,List<String>> hashmap=new HashMap();
	String words[]=str1.split(" ");
	hashmap =Arrays.stream(words)
	.collect(Collectors.groupingBy(str->{
		char arr1[]=str.toCharArray();
		Arrays.sort(arr1);
		String str3=new String(arr1);
		return str3;
	}));
	
	System.out.println(hashmap);
	
}

private static String getString(String str1) {
	char arr1[]=str1.toCharArray();
	Arrays.sort(arr1);
	String str3=new String(arr1);
	return str3;
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