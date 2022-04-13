package String;

public class RemoveSpaceFromGivenWord {
public static void main(String[] args) {
	String Str="welcome to bangaluru";
	String[] s = Str.split(" ");
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]);
	}
}
}
