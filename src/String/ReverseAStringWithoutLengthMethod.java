package String;

public class ReverseAStringWithoutLengthMethod {
	public static void main(String[] args) {
		String str="james";
		char[] sc = str.toCharArray();
		int count=0;
		
		for ( char c:sc) {
			count++;
			
		}
		for (int i = count-1; i >=0; i--) {
			System.out.println(sc[i]);
			
		}
	}

}
