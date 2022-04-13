package ArrayPrograms;

public class minLengthStringArray {
	public static void main(String[] args) {
		String str[]= {"a","ab","abcd","apple","pagal"	};
		String min = str[0];
		for (int i = 0; i < str.length; i++) {

			if (min.length()>str[i].length()) {
				min=str[i];

			}

		}
		for (int i = 0; i < str.length; i++) {
			if (min.length()==str[i].length()) {
				System.out.println(str[i]);
				
			}
			
		}


	}

}
