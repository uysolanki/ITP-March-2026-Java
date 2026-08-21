package day5;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {								//			e	 4 	 <-top
		String s1="apple";													//			l	 3
																			//			p    2   
		Stack<Character> stack=new Stack();									//			p	 1 
		for(char ch:s1.toCharArray())			//ch						//			a	 0 
		{										//'n'						//				-1 
			stack.push(ch);
		}
		int flag=0;
		for(char ch:s1.toCharArray())			//ch		sh
		{										//'a'		'e'
			char sh=stack.pop();
			if(ch!=sh)
			{
				System.out.println("Not Palindrome");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Palindrome");
		}
		
	}

}
