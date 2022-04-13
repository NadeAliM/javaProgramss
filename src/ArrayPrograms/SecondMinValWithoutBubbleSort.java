package ArrayPrograms;

public class SecondMinValWithoutBubbleSort {
	public static void main(String[] args) {
		
	
	int a[]= {30,20,19,10,50,40,0,1};
	int fmin=a[0];
	int smin=a[0];
	for(int i=0;i<a.length;i++) {
		
		if(a[i]<fmin) {
			
			smin=fmin;
			fmin=a[i];
		}
		else if(a[i]<smin  && a[i]!=fmin) {
			smin=a[i];
			
		}
	}
	System.out.println(fmin+"    "+smin );
	
}
}
