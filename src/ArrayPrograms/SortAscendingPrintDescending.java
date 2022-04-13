package ArrayPrograms;

public class SortAscendingPrintDescending {
	public static void main(String[] args) {


		int a[]= {12,78,98,58,62,45};

		for(int i=0;i<a.length;i++) {
			for(int j=0;i<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

			}
		for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);
		}
		}
	}