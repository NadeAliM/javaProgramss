package Patterns;

import java.util.Scanner;

public class IncreasingPyramid {
	
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
			
		}
		
		System.out.println();
		
	}
//	Scanner sc=new Scanner(System.in);
//    System.out.println("Number");
//    int n=sc.nextInt();
//    for(int i=1;i<=n;i++)
//    {
//        for(int j=i;j<n;j++)
//        {
//            System.out.print(" ");
//        }
//        for(int k=1;k<=i;k++)
//        {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//    for(int i=n-1;i>=1;i--)
//    {
//    	for(int j=n-1;j>=i;j--)
//    	{
//    		System.out.print(" ");
//    	}
//    	for(int k=1;k<=i;k++)
//    	{
//    		System.out.print("* ");
//    	}
//    	System.out.println();
//    }
}
}
