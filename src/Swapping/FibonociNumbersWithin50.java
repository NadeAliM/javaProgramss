package Swapping;

public class FibonociNumbersWithin50 {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib3;
	//System.out.println(fib1+" "+fib2+" ");
	for (int i = 0; i <25; i++) {
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		if(fib3<25) {
			System.out.println(fib3);
		}
		else {
			break;
		}
		
	}
}
}
