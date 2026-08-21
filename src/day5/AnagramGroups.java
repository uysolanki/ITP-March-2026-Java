package day5;

import java.util.Arrays;

public class AnagramGroups {

	public static void main(String[] args) {
		String str1="listen".toLowerCase();
		String str2="dsilent".toLowerCase();
		
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String str3=new String(arr1);
		String str4=new String(arr2);
		
		if(str3.equals(str4))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
