package String;

import java.util.LinkedHashSet;

public class ToGetVowelsInGivenString {
public static void main(String[] args) {
	String str="testyantra";

		int count=0;
		char ch[]=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < str.length(); i++) {


	if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
	count++;
	
	set.add(ch[i]);
	}
	}
	System.out.println("vowels in sentence = "+set);
	System.out.println(str+" ="+count);
}
}

