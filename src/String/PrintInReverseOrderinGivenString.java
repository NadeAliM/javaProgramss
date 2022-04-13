package String;

import java.util.LinkedHashSet;

public class PrintInReverseOrderinGivenString {
	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);


		}
		for (Character ch : set) 
		{

			for (int j = s.length()-1;j>=0;j--) 
			{


				if(ch==s.charAt(j)) 
				{
					System.out.println(ch+"=="+(j+1));	
					break;
				}
			}


		}




	}
}
