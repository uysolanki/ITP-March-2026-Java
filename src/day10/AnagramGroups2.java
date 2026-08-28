package day10;

import java.util.Arrays;

public class AnagramGroups2 {

	public static void main(String[] args) {
		String str1="listen".toLowerCase();
		String str2="silent".toLowerCase();
		
		checkAnagram(str1,str2);
	}

	private static void checkAnagram(String str1, String str2) {
		str1=getString(str1);
		str2=getString(str2);	

		System.out.println(str1.equals(str2)?"Anagram":"Not Anagram");	
	}

	private static String getString(String str1) {
		char arr1[]=str1.toCharArray();
		Arrays.sort(arr1);
		String str3=new String(arr1);
		return str3;
	}

}
