package String;

import java.util.LinkedHashSet;

public class CharacterPositionWithoutDuplicate {
	public static void main(String[] args) {


		String s="testyantra";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);
		}
		for (Character ch : set) {

			for (int j = 0;j<s.length();j++) {

				if(ch==s.charAt(j)) {
					System.out.println(ch+"=="+(j+1));
					break;
				}
			}
		}
	}
}
