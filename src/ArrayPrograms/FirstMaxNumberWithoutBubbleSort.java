package ArrayPrograms;

public class FirstMaxNumberWithoutBubbleSort {
public static void main(String[] args) {
	
	int a[]= {45,54,10,60,42};

	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
		
	}
	System.out.println(max);
}
}
