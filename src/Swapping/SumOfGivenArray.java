package Swapping;

public class SumOfGivenArray {
	public static void main(String[] args) {
		 int n=568;
		 while(n>9) {
	int sum=0;
   while(n>0) {
     int dig=n%10;
    sum=sum+dig;
    n=n/10;
   }
   n=n+sum;
   }
		 if(n==1)
   System.out.println(n+"  is a happpy number");
		 else {
			 System.out.println("is not a happy number");
		 }
}

}
