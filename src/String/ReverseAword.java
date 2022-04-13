package String;

public class ReverseAword {
public static void main(String[] args) {
	String str="Welcome to city of temples hampi";
	String[] s = str.split(" ");
	for (int i = s.length-1; i >=0; i--) {
		System.out.print(s[i]+" ");
		
	}
}
}
