package Swapping;

public class fibonacciNumber {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib3;
	//System.out.print(fib1+" "+fib2+" ");
	for (int i = 1; i <=25; i++) {
	fib3=fib1+fib2;
	fib1=fib2;
	fib2=fib3;
	System.out.print(fib3+" ");
	if(fib3<25) 
	{
		System.out.print(fib3);
	}
	else 
	{
		break;
	}
	}
	
}
}
