package Swapping;

public class SumOfNumberinagivenString {
	public static void main(String[] args) {
		String s="ab112be54cd10";
		int sum=0;
		int tsum=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9' ) {
				int n=s.charAt(i)-48;
				sum=sum*10+ n;
				
			}
			else {
				tsum=tsum+sum;
				sum=0;
			}
			
		}
		System.out.println(tsum+sum);
	}

}
