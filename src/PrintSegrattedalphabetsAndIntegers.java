import java.util.Scanner;

public class PrintSegrattedalphabetsAndIntegers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str = sc.nextLine();
		String alp=" ";
		String numbers="";
		String spch="";
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)>='A' &&str.charAt(i)<='Z' ||str.charAt(i)>='a' &&str.charAt(i)<='z') {
				alp=alp+str.charAt(i);
			}
			else if(str.charAt(i)>='0' &&str.charAt(i)<='9') {
				numbers=numbers+str.charAt(i);
			}
			else {
				spch=spch+str.charAt(i);
			}
			
		}
		System.out.println(alp+ " "+numbers+" "+spch);
	}

}
