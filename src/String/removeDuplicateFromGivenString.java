package String;

import java.util.LinkedHashSet;

public class removeDuplicateFromGivenString {
public static void main(String[] args) {
	String str="welcome to pathaan to duniya to hell";
	String[] s = str.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (String word1 : s) {
		set.add(word1);
		System.out.println(set);
	}
	for (String word2 : set) {
		int count=0;
		for (String word3 : s) {
			if(word3.equals(word2)) {
				count++;
			}
			
		}
	System.out.println(word2+"="+count);	
	}
	
}
}
