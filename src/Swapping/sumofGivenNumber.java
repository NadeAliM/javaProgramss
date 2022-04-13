package Swapping;

public class sumofGivenNumber {

	public static void main(String[] args) {
		int sum=0;
		   int n=1234;
		 
		   while(n>9) {
		     int dig=n%10;
		    sum=sum+dig;
		    n=n/10;
		   }
		   System.out.println(sum);

	}

}
