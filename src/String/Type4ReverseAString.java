package String;

public class Type4ReverseAString {
public static void main(String[] args) {
	String str="james";
	char[] sc = str.toCharArray();
	int count=0;
	String rev="";
	
	for ( char c:sc) {
		count++;
		
	}
	for (int i = str.length()-1; i >=0; i--) {
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);

}
}
