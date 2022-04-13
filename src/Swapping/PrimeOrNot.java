package Swapping;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=1;
		for (int i = 1; i <=n/2; i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==2) {
		System.out.println("its a prime number");
	}
		else {
			System.out.println("not a prime number");
		}
	}
}
