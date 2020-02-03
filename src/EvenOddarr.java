/* there are two array each has 5 random nos.Now results should be array1 will have even nos and array 2 will have odd nos */

public class EvenOddarr {
public static void main(String[] args) {
	int a[]= {2,7,8,5,9};
	int b[]= {6,4,3,17,10};
	int i,j;
	for(i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
			int temp;
			for(j=0;j<b.length;j++) {
				if(b[j]%2==0) {
				temp=b[j];
				b[j]=a[i];
				a[i]=temp;
				}
			}
		//System.out.println("hi");
		System.out.println("Array A: " +a[i]);
		System.out.println("Array B: " +b[j]);
	} 
}
}
}
