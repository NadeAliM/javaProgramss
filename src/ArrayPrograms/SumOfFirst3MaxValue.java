package ArrayPrograms;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SumOfFirst3MaxValue {
public static void main(String[] args) {

	
	int a[]= {20,30,40,80,91,78};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
    int sum=0;
    for(int m=0;m<3;m++) {
	sum=sum+a[m];
	
   }
   System.out.println(sum);
	}
	
}


