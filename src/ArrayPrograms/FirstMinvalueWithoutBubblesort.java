package ArrayPrograms;

public class FirstMinvalueWithoutBubblesort {
public static void main(String[] args) {
	int a[]= {45,54,10,60,42};

	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
		
	}
	System.out.println(min);
}
}
