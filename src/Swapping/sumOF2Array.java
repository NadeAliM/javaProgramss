package Swapping;

public class sumOF2Array {
public static void main(String[] args) {
	int a[]= {10,50,60,70,10,5};
	int b[]= {10,42,32,01,007};
	int count=a.length;
	if(a.length<b.length) {
		count=b.length;
	}
	for (int i = 0; i < count; i++) {
		try {
			System.out.println(a[i]+b[i]);
		} catch (Exception e) {
			if(a.length>b.length) {
				System.out.println(a[i]);
			}
			else {
				System.out.println(b[i]);
			}
		}
	}
}
}
